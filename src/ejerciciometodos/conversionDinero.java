package ejerciciometodos;

import java.util.Scanner;

//esto es un programa en java jdk25 este programa hace conversiones de monedas, hoy estamos a dia 23/10/2025
public class conversionDinero {
    static Scanner sc = new Scanner(System.in);

    public static String introducirResouesta() {
        System.out.println("quieres cambiar monedas?");
        String resuesta = sc.nextLine();
        return resuesta;
    }

    public static double introducirEuros() {
        System.out.println("dime la cantidad");
        double cantidad = sc.nextDouble();
        sc.nextLine();
        return cantidad;
    }

    public static double cambiarMoneda(double cantidad) {
        System.out.println("dime que moneda quieres(libra,dolar,yen)");
        String moneda = sc.nextLine();
        if (moneda.equalsIgnoreCase("libra")) {
            return cantidad * 0.87;
        } else if (moneda.equalsIgnoreCase("dolar")) {
            return cantidad * 1.11;

        } else if (moneda.equalsIgnoreCase("yen")) {
            return cantidad * 120.63;
        }
        return cantidad;
    }

    public static void Imprimir() {
        System.out.println(cambiarMoneda(introducirEuros()));
    }

    public static void run() {
        String resultado = introducirResouesta();
        double eur = introducirEuros();
        double moneda = cambiarMoneda(eur);
        System.out.println(moneda);

    }

    static void main() {
        run();
    }

}
