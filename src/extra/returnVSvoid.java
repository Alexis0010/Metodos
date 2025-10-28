package extra;

import java.util.Scanner;


public class returnVSvoid {
    static Scanner sc = new Scanner(System.in);
    //el void solo hace ruido, no devuelve solo pide o imprime datos...
    //los int, boolean,string,double etc si que devuelven cosas el no habla solo devuelve

    public static int solicitarNumero() {
        System.out.println("Dime un número:");
        return sc.nextInt();  // ← aquí devuelves un dato
    }

    public static void mostrarResultado(int resultado) {
        System.out.println("El resultado es: " + resultado); // ← este método no devuelve nada, solo imprime
    }

    public static int sumar(int a, int b) {
        return a + b; // ← devuelve el resultado
    }

    public static void main(String[] args) {
        int x = solicitarNumero(); // este método TE DA un valor
        int y = solicitarNumero(); // este también

        int resultado = sumar(x, y); // guardas el resultado

        mostrarResultado(resultado); // aquí solo IMPRIMES, no recibes nada de vuelta
    }
}
