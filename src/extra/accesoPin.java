package extra;

import java.util.Scanner;

public class accesoPin {
    static Scanner sc = new Scanner(System.in);
    public static int PIN;

    public static int establecer() {
        System.out.println("pon el pin que quieras usar");
        return PIN = sc.nextInt();
    }

    public static int pedirPIN() {
        System.out.println("Dime el PIN");
        return sc.nextInt();
    }

    public static void contadorINTENTOS(int pinUSUARIO) {
        int pinCORRECTO = PIN;
        for (int i = 0; i <= 2; i++) {
            if (pinUSUARIO == pinCORRECTO) {
                System.out.println("BIENVENIDO");
                break;
            } else if (i == 2) {
                System.out.println("limite de fallos");
                break;
            } else {
                System.out.println("pin incorrecto, quedan " + (2 - i) + " intentos");
                pedirPIN();
            }

        }

    }

    static void main() {
        establecer();
        int p = pedirPIN();
        contadorINTENTOS(p);


    }
}
