/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiónproductos;

public class Producto {
       // Atributos
    String nombreProducto;
    double precio;
    int estado; // 1 = Disponible, 0 = Agotado
    int stock;

    // Constructores
    public Producto() {
    }

    public Producto(String nombreProducto, double precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        verificarEstado();
    }

    // Métodos
    public void vender(int cantidad) {
        if (cantidad > 0) {
            if (stock >= cantidad) {
                stock -= cantidad;
                System.out.println("Venta realizada. Unidades vendidas: " + cantidad);
                verificarEstado();
            } else {
                System.out.println("No hay suficiente stock. Stock disponible: " + stock);
            }
        } else {
            System.out.println("La cantidad a vender debe ser mayor a cero.");
        }
    }

    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Se reabastecio el producto. Nuevo stock: " + stock);
            verificarEstado();
        } else {
            System.out.println("La cantidad a reabastecer debe ser mayor a cero.");
        }
    }

    public void verificarEstado() {
        if (stock == 0) {
            estado = 0;
            System.out.println("Producto Agotado. ");
        } else {
            estado = 1;
            System.out.println("Producto Disponible. ");
        }
    }

    public void mostrarProducto() {
        System.out.println("== INFORMACIÓN DEL PRODUCTO ==");
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Estado: " + (estado == 1 ? "Disponible" : "Agotado"));
    }
}