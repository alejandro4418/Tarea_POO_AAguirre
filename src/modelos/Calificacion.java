package modelos;

public class Calificacion {
    String nombre = "Alejandro";
    double nota1 = 7.9;
    double nota2 = 9.1;
    double nota3 = 6.4;

    public double calcularProemdio(){
        double promedio = (nota1 + nota2 + nota3) / 3;
        return promedio;
    }

    public String determinarEstado(){
        if (calcularProemdio() >= 7){
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public String getNombre(){
        return nombre;
    }
}
