package modelos;

import java.util.Scanner;

public class PlantillaLuz {
    String cliente;
    double consumo;
    double costoKW;

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        cliente = sc.nextLine();

        System.out.print("Consumo (kW): ");
        consumo = sc.nextDouble();

        System.out.print("Costo por kW: ");
        costoKW = sc.nextDouble();
    }

    public double calcularSubtotal() {
        return consumo * costoKW;
    }

    public double calcularIVA() {
        return calcularSubtotal() * 0.15;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIVA();
    }

    public void mostrarPlantilla() {
        System.out.println("\n------------- PLANILLA DE LUZ -------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("IVA (15%): " + calcularIVA());
        System.out.println("Total a pagar: " + calcularTotal());
        System.out.println("-------------------------------------------");
    }

}
