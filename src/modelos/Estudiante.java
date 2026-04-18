package modelos;

import java.util.Scanner;

public class Estudiante {
    String nombre;
    String carrera;
    int edad;

    public void registrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la carrera del estudiante: ");
        carrera = sc.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        edad = sc.nextInt();
    }

    public void mostrarDatos(){
        System.out.println("----- DATOS DEL ESTUDIANTE -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);

    }
}
