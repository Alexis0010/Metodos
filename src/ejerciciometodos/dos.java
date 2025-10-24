package ejerciciometodos;

import java.util.Scanner;

public class dos {
    static Scanner sc = new Scanner(System.in);
    static void main() {
        int nPiezas = pedirNumeroPiezas();
        int piezasAptas = contarPiezasAptas(nPiezas);
        resultado(piezasAptas);
    }
    public static int pedirNumeroPiezas() {
        System.out.println("Dime el número de piezas a procesar:");
        return sc.nextInt();
    }
    public static int contarPiezasAptas(int nPiezas) {
        int acumulador = 0;
        for (int i = 1; i <= nPiezas; i++) {
            System.out.println("Dime la longitud de la pieza " + i + ":");
            double longitud = sc.nextDouble();

            if (longitud >= 1.20 && longitud <= 1.30) {
                acumulador++;
            }
        }
        return acumulador;
    }
    public static void resultado(int piezasAptas) {
        System.out.println("El número de piezas aptas en el lote es de: " + piezasAptas);
    }
}