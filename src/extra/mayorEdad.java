package extra;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class mayorEdad {
    static Scanner sc = new Scanner(System.in);
    public static int leerEdad(){
        System.out.println("Dime tu edad porfavor");
        return sc.nextInt();

    }
    public static boolean esMayorEdad(int edad){

        if (edad>=18){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args){
        int edad = leerEdad();
        boolean resultado = esMayorEdad(edad);
        if (resultado){
            System.out.println("eres mayor de edad");

        }else  {
            System.out.println("no es mayor de edad");
        }
    }
}
