package principal;


import input.Input;
import output.Output;
import validador.Validador;

public class AlumnoApp {

    private static Output output;
    private static Input input;
    private static boolean usuarioQuiereSeguir;
    private static int opcionMenu;




    public static void main(String[] args) {
        output = new Output();
        input = new Input();
        usuarioQuiereSeguir = true;



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


            }
            case 2 ->{

            }
            case 3 ->{

            }
            case 4 ->{

            }
            case 5 ->{
                usuarioQuiereSeguir =false;
            }
        }
    }






}
