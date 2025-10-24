package ejerciciometodos;

import java.util.Scanner;


public class uno {
    static Scanner sc = new Scanner(System.in);

    public static int leernumero() {
        int numero;
        System.out.print("Ingrese el numero: ");
        numero = sc.nextInt();
        return numero;
    }

    public static int comprobarnumero(int numero) {
        if (numero < 8) {
            return visualizartriple(numero);
        } else {
            return visualizardoble(numero);

        }

    }

    public static int visualizartriple(int numero) {
        int triple = numero * 3;
        return triple;
    }

    public static int visualizardoble(int numero) {
        int doble = numero * 2;
        return doble;
    }

    static void main() {
        int n = leernumero();
        int resultado = comprobarnumero(n);
        if (n < 8) {
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("El resultado es: " + resultado);
        }


    }
}