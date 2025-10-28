package extra;

import java.util.Scanner;


public class tripleComparacion {
    static Scanner sc = new Scanner(System.in);

    public static int pedirNumeros() {
        System.out.println("dime un numero porfa");
        return sc.nextInt();
    }

    public static boolean todosPositivos(int a, int b, int c) {
        return (a > 0) && (b > 0) && (c > 0);
    }

    public static void main(String[] args) {
        int a = pedirNumeros();
        int b = pedirNumeros();
        int c = pedirNumeros();
        boolean resultado = todosPositivos(a, b, c);
        if (resultado) {
            System.out.println("todos son positivos");
        } else {
            System.out.println("tienes algun negativo o 0");
        }
    }
}
