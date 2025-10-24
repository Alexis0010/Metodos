package ejerciciometodos;
import java.util.Scanner;
public class iva {
    static Scanner sc = new Scanner(System.in);
    public static double introducirPrecioProducto(){
        System.out.println("dime el precio del objeto");
        return sc.nextDouble();
    }
    public static double calcularPrecioIva(double precio){
        return precio+(precio*0.21);
    }
    public static void imprimirResultados(){
        System.out.println(calcularPrecioIva(introducirPrecioProducto()));
    }
    public static void run(){
        double precio=introducirPrecioProducto();
        double precioIva=calcularPrecioIva(precio);
    }
    static void main() {
    run();
    }
}
