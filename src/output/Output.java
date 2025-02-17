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
}
