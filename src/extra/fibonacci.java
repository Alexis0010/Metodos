package extra;

import java.util.Scanner;


public class fibonacci {
    static Scanner sc = new Scanner(System.in);

    public static int introducirPosicion() {
        System.out.println("dime en que posicion estamos, intervalo de 1 a mas infinito");
        return sc.nextInt();
    }
    public static int calcularNumero(int posicion) {
        if (posicion <= 0) {
            System.out.println("error de intervalo");
        }
        if (posicion == 1 || posicion == 2) {
            return 1;
        }
        int a = 1, b = 1, fib = 0;
        for (int i = 3; i <= posicion; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return b;
    }
    public static void visualizar() {
        int pos = introducirPosicion();
        int resultado = calcularNumero(pos);
        if (resultado == -1) {
            System.out.println("No se puede calcular para posiciones <= 0.");
        } else {
            System.out.println("El numero Fibonacci en la posicion " + pos + " es: " + resultado);
        }
    }
    static void main() {
        visualizar();

    }

}
