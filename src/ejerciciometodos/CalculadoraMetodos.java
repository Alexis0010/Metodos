package ejerciciometodos;

import java.util.Scanner;


public class CalculadoraMetodos {

    static Scanner sc = new Scanner(System.in);


    public static int leerNumero() {
        System.out.println("dime un numero");
        return sc.nextInt();
    }

    public static int leerNumero2() {
        System.out.println("dime un numero");
        return sc.nextInt();
    }

    public static int mostrarMenu() {
        System.out.println("que opcion quieres hacer");
        System.out.println("1)sumar");
        System.out.println("2)restar");
        System.out.println("3)multiplicar");
        System.out.println("4)dividir");
        return sc.nextInt();
    }

    public static double calcularOperacion(int n1, int n2, int opcion) {
        if (opcion == 1) {
            return n1 + n2;
        } else if (opcion == 2) {
            return n1 - n2;
        } else if (opcion == 3) {
            return n1 * n2;
        } else if (opcion == 4) {
            if (n2 == 0) {
                System.out.println("no se pude dividir algo entre 0");
                return 0;
            } else
                return (double) n1 / n2;
        } else {
            System.out.println("Opcion incorrecta");
            return 0;

        }
    }

    public static void imprimirResulado(double resultado) {
        System.out.println("el resultado es: " + resultado);
    }

    static void main() {
        int n1 = leerNumero();
        int n2 = leerNumero2();
        int opcion = mostrarMenu();
        double resultado = calcularOperacion(n1, n2, opcion);
        imprimirResulado(resultado);
    }
}
