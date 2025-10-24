package ejerciciometodos;

import java.util.Scanner;

public class tres {
    static Scanner sc = new Scanner(System.in);

    public static int leernumero() {
        System.out.print("pon el (0 para salir): ");
        return sc.nextInt();
    }

    public static int comprobarnumero(int numero) {
        if (numero < 8) {
            return visualizartriple(numero);
        } else {
            return visualizardoble(numero);
        }
    }

    public static int visualizartriple(int numero) {
        return numero * 3;
    }

    public static int visualizardoble(int numero) {
        return numero * 2;
    }
    static void main() {
        int n = leernumero();
        while (n != 0) {
            int resultado = comprobarnumero(n);
            System.out.println("El resultado es: " + resultado);
            n = leernumero();
        }
        System.out.println("fin de programa");
    }
}
