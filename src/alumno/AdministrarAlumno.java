package alumno;

import input.Input;
import output.Output;

import java.util.*;

public class AdministrarAlumno {

    public static List<Alumno> listaAlumnos;
    public static Output output ;
    public static Input input ;


    public AdministrarAlumno() {
        listaAlumnos = new ArrayList();
        output = new Output();
        input = new Input();

    }


    public  void agregarAlumno(){
        output.mostrarMensajeDni();
        String dniAlumno = input.getPalabra();
        output.mostrarMensajeNombre();
        String nombre = input.getPalabra();
        System.out.println("ingrese apellido 1");
        String apellido1 = input.getPalabra();
        System.out.println("ingrese apellido 2");
        String apellido2 = input.getPalabra();
        output.mostrarMensajeEdad();
        int edad = input.getInt();
        output.mostrarMensajeFechaNac();
        String fechaNac = input.getPalabra();
        output.mostrarMensajeAsignatura();
        String asignatura1 = input.getPalabra();
        output.mostrarMensajeNota();
        double nota1 = input.getDouble();
        output.mostrarMensajeAsignatura();
        String asignatura2 = input.getPalabra();
        output.mostrarMensajeNota();
        double nota2 = input.getDouble();

        listaAlumnos.add(new Alumno(dniAlumno,nombre,apellido1, apellido2,edad,fechaNac,asignatura1,nota1,asignatura2,nota2));


    }

    public  void listarAlumnos() {

        String formato = "| %-12s | %-15s | %-4s | %-12s | %-15s | %-4s | %-15s | %-4s |\n";


        output.imprimirLinea();
        output.imprimirCabecera(formato);
        output.imprimirLinea();


        for (Alumno alumno : listaAlumnos) {

            output.imprimirAlumno(formato,alumno.getDniAlumno(), alumno.getNombreCompleto(), alumno.getEdad(), alumno.getFechaNac(), alumno.getAsignatura1(), alumno.getNostaAsignatura1(), alumno.getAsignatura2(), alumno.getNotaAsignatura2());
        }

        output.imprimirLinea();
    }


    public void actualizarAlumnos() {

        String formato = "| %-12s | %-15s | %-15s | %-4s | %-15s | %-4s |\n";


        output.imprimirLineaModificar();
        output.imprimirCabeceraActulizar(formato);
        output.imprimirLineaModificar();


        for (Alumno alumno : listaAlumnos) {

            output.imprimirAlumnoModificar(formato,alumno.getDniAlumno(), alumno.getNombreCompleto(), alumno.getAsignatura1(), alumno.getNostaAsignatura1(), alumno.getAsignatura2(), alumno.getNotaAsignatura2());
        }

        output.imprimirLineaModificar();



        int i =0;
        boolean encontrado = false;

        output.mostrarMensajeDni();
        String dni = input.getPalabra();


        while (!encontrado && i < listaAlumnos.size()){

            if (listaAlumnos.get(i).getDniAlumno().equals(dni)){
                encontrado = true;
            }else {
                i++;
            }

        }

        if (encontrado){

            output.imprimirMensajeSeleccionAlumnosActualizar();

            int opcionAsignaturaActualizar = input.getInt();

            if (opcionAsignaturaActualizar == 1){
                output.mostrarMensajeAsignatura();
                String asignaturaActualizada1 = input.getPalabra();
                output.mostrarMensajeNota();
                double notaActualizada1 = input.getDouble();
                listaAlumnos.get(i).setAsignatura1(asignaturaActualizada1);
                listaAlumnos.get(i).setNostaAsignatura1(notaActualizada1);
            } else if (opcionAsignaturaActualizar == 2) {
                output.mostrarMensajeAsignatura();
                String asignaturaActualizada2 = input.getPalabra();
                output.mostrarMensajeNota();
                double notaActualizada2 = input.getDouble();


                listaAlumnos.get(i).setAsignatura2(asignaturaActualizada2);

                listaAlumnos.get(i).setNotaAsignatura2(notaActualizada2);
            }else {

                output.mostrarMensajeOocionInvalida();
            }




        }else {
            output.mostrarMensajeDniNoEncontrado();

        }




    }

    public void eliminarAlumnos(){

        String formato = "| %-12s | %-15s | %-15s | %-4s | %-15s | %-4s |\n";


        output.imprimirLineaModificar();
        output.imprimirCabeceraActulizar(formato);
        output.imprimirLineaModificar();


        for (Alumno alumno : listaAlumnos) {

            output.imprimirAlumnoModificar(formato,alumno.getDniAlumno(), alumno.getNombreCompleto(), alumno.getAsignatura1(), alumno.getNostaAsignatura1(), alumno.getAsignatura2(), alumno.getNotaAsignatura2());
        }

        output.imprimirLineaModificar();

        Iterator<Alumno> iAlumno = listaAlumnos.iterator();

        boolean encontrado = false;


        output.mostrarMensajeDni();
        String dni = input.getPalabra();

        while (iAlumno.hasNext() && !encontrado){

            if (iAlumno.next().getDniAlumno().equals(dni)){
                iAlumno.remove();
                encontrado = true;
            }
        }


        if (!encontrado){
            output.mostrarMensajeDniNoEncontrado();
        }else {
            output.mostrarMensajeAlumnoEliminado();
        }


    }



    public void buscarAlumno(){

        ordenarListaAlumnos(listaAlumnos);

        for (Alumno lista: listaAlumnos){
            System.out.println(lista);
        }

    }





        public static void ordenarListaAlumnos(List<Alumno> listaAlumnos) {
            int numberOfNumbers = listaAlumnos.size();
            for (int i = 0; i < numberOfNumbers; i++) {
                for (int j = 0; j < numberOfNumbers - 1; j++) {
                    if (compararCadenas(listaAlumnos.get(j).getApellido1(),listaAlumnos.get(j+1).getApellido1())) {
                        swap(listaAlumnos, j, j + 1);

                    }
                }
            }
        }


        private static boolean compararCadenas(String cadena1, String cadena2){

        boolean esMayor = false;
        int tamañoCadena = cadena1.length();
            for (int i = 0; i < tamañoCadena; i++) {
                    if (cadena1.charAt(i) > cadena2.charAt(i)){
                        esMayor = true;
                    }
            }
            return  esMayor;
        }


    private static void swap(List<Alumno> data, int a, int b) {

        Alumno temp = data.get(a);
        data.set(a,data.get(b));
        data.set(b,temp);
//        data.get(a) = data.set(b,data.get(b));
//        data.set(b,data.get(b)) = temp;
    }







}


