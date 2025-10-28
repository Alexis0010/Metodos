package extra;

import java.util.Scanner;

//Scanner
public class negativos {
    static Scanner sc = new Scanner(System.in);
    public static int pedirNumero(){
        System.out.println("dime un numero porfavor");
        return sc.nextInt();

    }
    public static boolean esPositivo(int n){
        return n>0;
    }
    public static boolean esNegativo(int n){
        return n<0;
    }
    public static boolean esCero(int n){
        return n==0;
    }
    public static void main(String[] args) {
        int n=pedirNumero();
        if(esPositivo(n)){
            System.out.println("es positivo");
        }
        if(esNegativo(n)){
            System.out.println("es negativo");
        }
        if(esCero(n)){
            System.out.println("es cero");
        }
    }
}
