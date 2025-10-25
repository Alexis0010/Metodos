package extra;

import java.util.Scanner;


public class termometro {
    static Scanner sc = new Scanner(System.in);
    public static int temperatura() {
        System.out.println("que temperatura tienes ");
        System.out.println("1)muy frio");
        System.out.println("2)frio");
        System.out.println("3)alto");
        System.out.println("4)muy alto");
        return sc.nextInt();
    }
    public static void hacefrio(int temperatura) {
        if (temperatura == 1) {
            System.out.println("muy frio");
        } else if (temperatura == 2) {
            System.out.println("frio");
        } else if (temperatura == 3) {
            System.out.println("alto");
        } else if (temperatura == 4) {
            System.out.println("muy alto");
        } else {
            System.out.println("Opcion incorrecta");
            temperatura();
        }
    }
    static void main() {
        int t = temperatura();
        hacefrio(t);

    }
}

