package output;

public class Output {

    public void mostrarMenu(){
        System.out.println("""
                Ingrese la opcion que desea realizar
                1.Agregar Alumno
                2.Listar Alumno
                3.Modificar Alumno
                4.Eliminar Alumno
                5.Salir                
                """);
    }

    public void mostrarMensajeDni() {
        System.out.println("Ingrese numero de DNI");
    }

    public void mostrarMensajeNombre() {
        System.out.println("ingrese Nombre");
    }

    public void mostrarMensajeEdad() {
        System.out.println("ingrese edad");
    }

    public void mostrarMensajeFechaNac() {
        System.out.println("ingrese fecha de nacimiento");
    }

    public void mostrarMensajeAsignatura() {
        System.out.println("ingrese Asignatura");
    }


    public void mostrarMensajeNota() {
        System.out.println("ingrese Nota");
    }

    public void imprimirCabecera(String formato){

        System.out.printf(formato," Dni ", "Nombre Alumno", "Edad", "Fecha", "Asignatura 1", "Nota", "Asignatura 2", "Nota");
    }

    public void imprimirAlumno(String formato, String dniAlumno, String nombre, int edad, String fecha, String asignatura1, double nota1,String asignatura2 , double nota2){

        System.out.printf(formato,dniAlumno, nombre, edad, fecha, asignatura1, nota1, asignatura2, nota2);
    }

    public void imprimirLinea(){
        System.out.println("+--------------+-----------------+------+--------------+-----------------+------+-----------------+------+");

    }
}
