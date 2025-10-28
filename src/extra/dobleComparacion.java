package extra;

import java.util.Scanner;


public class dobleComparacion {
    static Scanner sc = new Scanner(System.in);

    public static int pedirNumero() {
        System.out.println("dime un numero");
        return sc.nextInt();
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esPositivo(int n) {
        return n > 0;
    }

    public static boolean cumpleCondiciones(int n) {
        return esPar(n) && esPositivo(n);
    }

    public static void main(String[] args) {
        int n = pedirNumero();
        boolean respuesta = cumpleCondiciones(n);

        if (respuesta) {
            System.out.println("aprobado");
        } else {
            System.out.println("no apto");
        }


    }

}
