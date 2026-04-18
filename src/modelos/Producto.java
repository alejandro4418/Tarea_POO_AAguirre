package modelos;

import java.util.Scanner;

public class Producto {
    String nombre_producto;
    double precio;
    int cantidad;

    public void ingresarDatos(){
        System.out.println("------------------------------");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        nombre_producto = sc.nextLine();
        System.out.println("Ingrese el precio: ");
        precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        cantidad = sc.nextInt();
        System.out.println(" ");
    }

    public void mostrarFactura(){
        double total = precio * cantidad;

        if (total > 1000){
            double descuento = total * 0.10;
            total = total - descuento;
            System.out.println("Descuento aplicado del 10%");
        }

        System.out.println("------- Factura -------");
        System.out.println(" ");
        System.out.println("Producto "+ nombre_producto);
        System.out.println("Precio unitario: "+ precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println(" ");
        System.out.println("Total a pagar: " + total);
        System.out.println(" ");
        System.out.println("------------------------------");

    }
}
