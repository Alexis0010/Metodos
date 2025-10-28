package extra;

import java.util.Scanner;


public class hacerNombre {
    static Scanner sc = new Scanner(System.in);

    public static String nombre() {
        System.out.println("dime tu nombre");
        return sc.nextLine();
    }
    public static String apellidos() {
        System.out.println("dime tus apellidos");
        return sc.nextLine();
    }
    public static void juntarNombre() {
        String nombre = nombre() + " "+apellidos();
        System.out.println("Tu nombre es: ");

        System.out.println(nombre);
    }
    static void main() {
        juntarNombre();
    }


}
