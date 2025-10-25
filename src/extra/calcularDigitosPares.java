package extra;

import java.util.Scanner;

public class calcularDigitosPares {

    static Scanner sc = new Scanner(System.in);

    // a) leerEntero → leer número
    public static int leerEntero() {
        System.out.println("Introduce un número de 4 dígitos (0 para salir): ");
        return sc.nextInt();
    }

    // b) comprobarNumero → validar que tiene 4 dígitos
    public static boolean comprobarNumero(int num) {
        return num >= 1000 && num <= 9999;
    }

    // c) determinarParImpar → true si todos son pares, false si hay alguno impar
    public static boolean determinarParImpar(int num) {
        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 != 0) {
                return false; // hay impar
            }
            num /= 10;
        }
        return true; // todos pares
    }

    // d) visualizarResultado
    public static void visualizarResultado(int num, boolean todosPares) {
        if (todosPares) {
            System.out.println("El número " + num + " tiene todos los dígitos pares.");
        } else {
            System.out.println("El número " + num + " tiene dígitos impares.");
        }
    }

    // e) run → controla el proceso completo
    public static void run() {
        int numero = leerEntero();

        while (numero != 0) {
            if (!comprobarNumero(numero)) {
                System.out.println("Número incorrecto. Debe ser de 4 dígitos.");
            } else {
                boolean resultado = determinarParImpar(numero);
                visualizarResultado(numero, resultado);
            }
            numero = leerEntero(); // pedir otro
        }

        System.out.println("Programa finalizado.");
    }

    static void main() {
        run();
    }
}
