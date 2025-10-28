package extra;

import java.util.Scanner;


public class contra {
    static Scanner sc = new Scanner(System.in);

    public static String decirContra() {
        System.out.println("dime tu contraseña porfavor, parte de letras");
        return sc.nextLine();
    }

    public static int decirNumeros() {
        System.out.println("dime la parte numerica");
        return sc.nextInt();
    }

    public static void juntarContra() {

        String contraseña = decirContra() + decirNumeros();
        System.out.print("tu contraseña es: ");
        System.out.println(contraseña);
    }

    static void main() {

        juntarContra();
    }
}
