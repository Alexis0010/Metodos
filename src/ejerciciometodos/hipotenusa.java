package ejerciciometodos;

import java.util.Scanner;

public class hipotenusa {
    static Scanner sc = new Scanner(System.in);

    public static double introducirCateto() {
        System.out.println("Ingrese el cateto: ");
        return sc.nextDouble();
    }

    public static double introducirCateto2() {
        System.out.println("Ingrese el cateto: ");
        return sc.nextDouble();
    }

    public static double calcularHipotenusa( double cateto,double cateto2) {
        return Math.sqrt((cateto*cateto)+(cateto2*cateto));
    }
    public static void empezar(){
        double c1 = introducirCateto();
        double c2 = introducirCateto2();
        double h = calcularHipotenusa(c1, c2);
        System.out.println("La hipotenusa es: " + h);
    }

    static void main() {
        empezar();
    }
}
