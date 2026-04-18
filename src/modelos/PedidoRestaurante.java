package modelos;

import java.util.Scanner;

public class PedidoRestaurante {
    String cliente;
    String plato;
    double precio;
    int cantidad;

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cliente: ");
        cliente = sc.nextLine();

        System.out.print("Plato: ");
        plato = sc.nextLine();

        System.out.print("Precio: ");
        precio = sc.nextDouble();

        System.out.print("Cantidad: ");
        cantidad = sc.nextInt();
    }

    public double calcularSubtotal(){
        double subtotal = precio * cantidad;
        return subtotal;
    }

    public double calcularDescuento(){
        if (calcularSubtotal() > 25){
            return calcularSubtotal() * 0.10;
        } else {
            return 0;
        }
    }

    public double calcularTotal(){
        if (calcularSubtotal() > 25){
            return calcularSubtotal() - (calcularSubtotal() * 0.10);
        } else {
            return calcularSubtotal();
        }
    }

    public void mostrarCuenta(){
        System.out.println("----- CUENTA DEL PEDIDO -----");
        System.out.println("Cliente: "+ cliente);
        System.out.println("Plato: "+ plato);
        System.out.println("Precio: "+ precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("Descuento: "+ calcularDescuento());
        System.out.println("Total final: " + calcularTotal());
    }

}
