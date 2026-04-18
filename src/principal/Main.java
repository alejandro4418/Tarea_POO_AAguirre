package principal;

import modelos.*;

public class Main {
    void main(){
        /*
        Estudiante e1 = new Estudiante();
        e1.registrarDatos();
        e1.mostrarDatos();

        Producto p1 = new Producto();
        p1.ingresarDatos();;
        p1.mostrarFactura();

        Calificacion c1 = new Calificacion();
        System.out.println("----REPORTE ACADEMICO----");
        System.out.println("Nombre: "+ c1.getNombre());
        System.out.println("Promedio: " + c1.calcularProemdio());
        System.out.println("Estado: " + c1.determinarEstado());
        System.out.println("----------------------------------");

        PlantillaLuz p2 = new PlantillaLuz();
        p2.ingresarDatos();
        p2.mostrarPlantilla();

        Empleado e2 = new Empleado();
        e2.ingresarDatos();
        e2.mostrarReporte();

        PedidoRestaurante p3 = new PedidoRestaurante();
        p3.ingresarDatos();
        p3.mostrarCuenta();
        */

        ProductoInventario p4 = new ProductoInventario("PRD-105", "Disco SSD 1TB", "Almacenamiento", 89.50, 12, 8);
        p4.reporteFinal();
        p4.setPrecio_unitario(95.0);
        p4.setStock_disponible(5);
        p4.reporteFinal();
        p4.setStock_disponible(-3);

    }
}
