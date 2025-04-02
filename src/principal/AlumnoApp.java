package principal;

import alumno.AdministrarAlumno;

import input.Input;
import output.Output;
import validador.Validador;

public class AlumnoApp {

    private static Output output;
    private static Input input;
    private static boolean usuarioQuiereSeguir;
    private static int opcionMenu;
    private static AdministrarAlumno alumno;




    public static void main(String[] args) {
        output = new Output();
        input = new Input();
        usuarioQuiereSeguir = true;
        alumno = new AdministrarAlumno();



        do {

            do {
                mostrarMenu();
                recibirOpcionMenu();
            }while (!validarOpcionMenu());
            ejecutarPrograma();

        }while (usuarioQuiereSeguir);


    }





    private static void mostrarMenu(){
        output.mostrarMenu();
    }

    private static int recibirOpcionMenu(){
        opcionMenu= input.getInt();
        return opcionMenu;
    }

    private static boolean  validarOpcionMenu(){
        Validador validar = new Validador();
        boolean esValido = validar.validarOpcionMenu(opcionMenu);
        return esValido;
    }

    private static void ejecutarPrograma(){


        switch (opcionMenu){
            case 1 ->{
            agregarAlumno();

            }
            case 2 ->{
                listarAlumno();
            }
            case 3 ->{
                modificarAlumno();
            }
            case 4 ->{
                eliminarAlumno();
            }
            case 5 ->{
                buscarAlumno();
            }
            case 6 ->{
                usuarioQuiereSeguir =false;
            }

        }
    }

    private static void buscarAlumno(){

        alumno.buscarAlumno();
    }

    private static void agregarAlumno(){

        alumno.agregarAlumno();
    }

    private static void listarAlumno(){

        alumno.listarAlumnos();
    }

    private static void modificarAlumno(){

        alumno.actualizarAlumnos();
    }

    private static void eliminarAlumno(){

        alumno.eliminarAlumnos();
    }




}
