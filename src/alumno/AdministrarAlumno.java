package alumno;

import input.Input;
import output.Output;

import java.util.*;

public class AdministrarAlumno {

    public static List<Alumno> listaAlumnos;
    public static Output output ;
    public static Input input ;
    private static final int ENCONTRADO = 0;
    private static final int NOENCONTRADO = -1;



    public AdministrarAlumno() {
        listaAlumnos = new ArrayList();
        output = new Output();
        input = new Input();

    }


    /*public  void agregarAlumno(){
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


    }*/
    public  void agregarAlumno(){


        listaAlumnos.add(new Alumno("54452185","Mario","albazans","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("45485454","hans","albania","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("55445181","Antony","alba","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("12151155","pedro","zzz","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("87454851","hans","cebra","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("21451245","pepe","caceres","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("98659165","jose","gallardo","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("64484445","maria","villanueva","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("64915484","jacky","albac","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("64915484","jacky","caceres","gallardo",28,"14/08/1996","mates",5,"letras",8));
        listaAlumnos.add(new Alumno("64915484","jacky","barcelona","gallardo",28,"14/08/1996","mates",5,"letras",8));
    }


    public  void listarAlumnos() {

        String formato = "| %-12s | %-15s | %-15s | %-15s | %-4s | %-12s | %-15s | %-4s | %-15s | %-4s |\n";


        output.imprimirLinea();
        output.imprimirCabecera(formato);
        output.imprimirLinea();


        for (Alumno alumno : listaAlumnos) {

            output.imprimirAlumno(formato,alumno.getDniAlumno(),alumno.getNombreCompleto(), alumno.getApellido1(), alumno.getApellido2(), alumno.getEdad(), alumno.getFechaNac(), alumno.getAsignatura1(), alumno.getNostaAsignatura1(), alumno.getAsignatura2(), alumno.getNotaAsignatura2());
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



   public void buscarAlumno(String alumnoBuscar){

        ordenarListaAlumnos(listaAlumnos);

        int encontrado = encontrarEstudiante(listaAlumnos,alumnoBuscar);

        if (encontrado != NOENCONTRADO){
            System.out.println();
            System.out.println("El alumno es :");

            String formato = "| %-12s | %-15s | %-15s | %-15s | %-4s | %-12s | %-15s | %-4s | %-15s | %-4s |\n";


            output.imprimirLinea();
            output.imprimirCabecera(formato);
            output.imprimirLinea();


                output.imprimirAlumno(formato,listaAlumnos.get(encontrado).getDniAlumno(),
                        listaAlumnos.get(encontrado).getNombreCompleto(),
                        listaAlumnos.get(encontrado).getApellido1(),
                        listaAlumnos.get(encontrado).getApellido2(),
                        listaAlumnos.get(encontrado).getEdad(),
                        listaAlumnos.get(encontrado).getFechaNac(),
                        listaAlumnos.get(encontrado).getAsignatura1(),
                        listaAlumnos.get(encontrado).getNostaAsignatura1(),
                        listaAlumnos.get(encontrado).getAsignatura2(),
                        listaAlumnos.get(encontrado).getNotaAsignatura2());


            output.imprimirLinea();
        }
        else {
            System.out.println("el alumno no ha sido encontrado");
        }

    }

    public static int encontrarEstudiante(List<Alumno> listaAlumnos, String palabraBuscar) {

            int inicio = 0;
            int fin = listaAlumnos.size() - 1;

            while (inicio <= fin) {
                int medio = inicio + (fin - inicio) / 2;
                int comparacion = palabraBuscar.compareTo(listaAlumnos.get(medio).getApellido1());

                if (comparacion == ENCONTRADO) {
                    return medio;
                } else if (comparacion > ENCONTRADO) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            }

            return NOENCONTRADO;

    }

        public static void ordenarListaAlumnos(List<Alumno> listaAlumnos) {
            int numberOfNumbers = listaAlumnos.size();
            for (int i = 0; i < numberOfNumbers; i++) {
                for (int j = 0; j < numberOfNumbers -1 ; j++) {
                    if (compararCadenas2(listaAlumnos.get(j).getApellido1(),listaAlumnos.get(j+1).getApellido1())) {
                        swap(listaAlumnos, j, j + 1);

                    }
                }
            }
        }



    private static boolean compararCadenas2(String cadena1, String cadena2){

        char[] arrCad1 = cadena1.toCharArray();
        int numCarsCad1 = cadena1.length();

        char[] arrCad2 = cadena2.toCharArray();
        int numCarsCad2 = cadena2.length();

        int indiceActual = 0;
        int numMaxCaracteres = Math.min(numCarsCad1, numCarsCad2);

        while (indiceActual < numMaxCaracteres) {
            char currentChar1 = arrCad1[indiceActual];
            char currentChar2 = arrCad2[indiceActual];
            if (currentChar1 > currentChar2) {
                return true;
            }else if (currentChar1 < currentChar2) {
                return false;
            }

            indiceActual++;
        }

        if (indiceActual == numMaxCaracteres) {
            return numCarsCad1 > numCarsCad2;
        }

        return true;
    }



    private static void swap(List<Alumno> data, int a, int b) {

        Alumno temp = data.get(a);
        data.set(a,data.get(b));
        data.set(b,temp);

    }



}


