package input;

import java.util.Scanner;

public class Input {
    private static String palabra;
    private static int dato;
    private static Scanner sc = new Scanner(System.in);
    private static double nota;


    private static void palabra(){
        palabra = sc.nextLine();
    }

    public String getPalabra(){
        palabra();
        return palabra;
    }

    private static void dato(){
        dato = Integer.parseInt(sc.nextLine());
    }

    public int getInt(){
        dato();
        return dato;
    }

    private static void nota(){
        nota = Double.parseDouble(sc.nextLine());
    }

    public double getDouble(){
        nota();
        return nota;
    }
}

