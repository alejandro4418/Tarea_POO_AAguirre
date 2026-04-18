package modelos;

import java.util.Scanner;

public class Empleado {
    String nombre;
    int horasTrabajadas;
    double pagoHora;

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Horas trabajadas: ");
        horasTrabajadas = sc.nextInt();

        System.out.print("Pago por hora: ");
        pagoHora = sc.nextDouble();
    }
    public double calcularSueldoBase() {
        return horasTrabajadas * pagoHora;
    }

    public double calcularBono() {
        double sueldoBase = calcularSueldoBase();
        if (sueldoBase > 400) {
            return 20.0;
        }
        return 0;
    }

    public double calcularSueldoFinal() {
        return calcularSueldoBase() + calcularBono();
    }

    public void mostrarReporte() {
        System.out.println("\n------------- REPORTE DE EMPLEADO -------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + calcularSueldoBase());
        System.out.println("Bono: " + calcularBono());
        System.out.println("Sueldo final: " + calcularSueldoFinal());
        System.out.println("-----------------------------------------------");
    }
}
