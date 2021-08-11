package laboratorio3;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int participacion, examenp, examens, examenf;
        int totalcurso;
        
        System.out.println("CÁLCULO DE NOTAS DE UN ESTUDIANTE");
        System.out.print("Ingrese la nota de participación: ");
        participacion = (int) enter.nextFloat();
        System.out.print("Ingrese la nota de primer parcial: ");
        examenp = (int) enter.nextFloat();
        System.out.print("Ingrese la nota de segundo parcial: ");
        examens = (int) enter.nextFloat();
        System.out.print("Ingrese la nota de examen final: ");
        examenf = (int) enter.nextFloat();
        
        totalcurso = participacion + examenp + examens + examenf;
        
        System.out.println("La nota total del estudiante de Informática es de: " + totalcurso);
    }
}
