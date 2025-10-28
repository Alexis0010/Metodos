package extra;

import java.util.Scanner;


public class comprobarCarnet {
    static Scanner sc = new Scanner(System.in);
    public static int leerEdad(){
        System.out.println("Dime tu edad porfavor");
        return sc.nextInt();
    }
    public static String leerCarnet(){
        sc.nextLine();
        System.out.println("Dime si tienes carnet: si/no");
        return sc.nextLine();
    }
    public static boolean comprobarEdad(int edad){
        return edad>=18;
    }
    public static boolean comprobarCarnet(String carnet){
        return carnet.equalsIgnoreCase("si");
    }

    static void main() {
        int edad = leerEdad();


        if (comprobarEdad(edad)){
            String carnet = leerCarnet();
            if(comprobarCarnet(carnet)){
                System.out.println("puedes conducir");
            }else {
                System.out.println("no puedes conducir");
            }
        }else {
            System.out.println("no puedes conducir");
        }
    }
}
