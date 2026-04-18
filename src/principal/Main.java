package principal;

import modelos.Calificacion;
import modelos.Estudiante;
import modelos.Producto;

public class Main {
    void main(){
        /*
        Estudiante e1 = new Estudiante();
        e1.registrarDatos();
        e1.mostrarDatos();

        Producto p1 = new Producto();
        p1.ingresarDatos();;
        p1.mostrarFactura();
        */
        Calificacion c1 = new Calificacion();
        System.out.println("----REPORTE ACADEMICO----");
        System.out.println("Nombre: "+ c1.getNombre());
        System.out.println("Promedio: " + c1.calcularProemdio());
        System.out.println("Estado: " + c1.determinarEstado());
        System.out.println("----------------------------------");

    }
}
