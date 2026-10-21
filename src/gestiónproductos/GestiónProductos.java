/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiónproductos;
import java.util.Scanner;

public class GestiónProductos {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("=== REGISTRO INICIAL DEL PRODUCTO ===");
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el stock inicial: ");
        int stock = sc.nextInt();
        
        // Creamos el objeto producto con los datos ingresados
        Producto prod = new Producto(nombre, precio, stock);
        
        int op = 0;
        do {
            System.out.println("== MENU DE GESTION ==");
            System.out.println("1. Vender Producto");
            System.out.println("2. Reabastecer Stock");
            System.out.println("3. Mostrar InformaciOn del Producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantVenta = sc.nextInt();
                    prod.vender(cantVenta);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a reabastecer: ");
                    int cantReabastecer = sc.nextInt();
                    prod.reabastecer(cantReabastecer);
                    break;
                case 3:
                    prod.mostrarProducto();
                    break;
                case 4: break;
                
                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        } while (op != 4);
        
        sc.close();
    }
}