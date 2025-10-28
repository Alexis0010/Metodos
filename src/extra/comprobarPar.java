package extra;

import java.util.Scanner;


public class comprobarPar {
    static Scanner sc = new Scanner(System.in);

    public static int leerNumero() {
        System.out.println("dime un numero");
        return sc.nextInt();
    }

    public static boolean esPar(int n) {
       return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = leerNumero();
        boolean resultado = esPar(n);
        if (resultado) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero no es par");


        }
    }
}
