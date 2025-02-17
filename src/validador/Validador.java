package validador;

public class Validador {

    public boolean validarOpcionMenu(int opcionMenu){

        if (opcionMenu> 0 && opcionMenu<6){
            return  true;
        }
        else {
            return false;
        }
    }
}
