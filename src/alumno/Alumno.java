package alumno;

public class Alumno {

    String dniAlumno;
    String nombreCompleto;

    String apellido1;
    String apellido2;
    int edad;
    String fechaNac;
    String asignatura1;
    String asignatura2;
    double nostaAsignatura1;
    double notaAsignatura2;



    public Alumno() {

    }

    public Alumno(String dniAlumno, String nombreCompleto,String apellido1, String apellido2, int edad, String fechaNac, String asignatura1,double nostaAsignatura1, String asignatura2,  double notaAsignatura2) {
        this.dniAlumno = dniAlumno;
        this.nombreCompleto = nombreCompleto;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.asignatura1 = asignatura1;
        this.nostaAsignatura1 = nostaAsignatura1;
        this.asignatura2 = asignatura2;
        this.notaAsignatura2 = notaAsignatura2;
    }


    public String getDniAlumno() {
        return dniAlumno;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getAsignatura1() {
        return asignatura1;
    }

    public String getAsignatura2() {
        return asignatura2;
    }

    public double getNostaAsignatura1() {
        return nostaAsignatura1;
    }

    public double getNotaAsignatura2() {
        return notaAsignatura2;
    }


    public void setAsignatura1(String asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public void setAsignatura2(String asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public void setNostaAsignatura1(double nostaAsignatura1) {
        this.nostaAsignatura1 = nostaAsignatura1;
    }

    public void setNotaAsignatura2(double notaAsignatura2) {
        this.notaAsignatura2 = notaAsignatura2;
    }

    public String getApellido1() {
        return apellido1;
    }



    public String getApellido2() {
        return apellido2;
    }



    @Override
    public String toString() {
        return
                nombreCompleto + " "+
                        apellido1 + " "+
                        apellido2 + " "+
                        edad + " "+
                        fechaNac + " " +
                        asignatura1 + " " +
                        nostaAsignatura1 + " "+
                        asignatura2 + " " +
                        notaAsignatura2
                ;
    }
}

