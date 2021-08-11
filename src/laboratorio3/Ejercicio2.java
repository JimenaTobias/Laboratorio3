package laboratorio3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        float sueldo, horas, total;
        
        System.out.print("Ingrese su sueldo mensual: ");
        sueldo = enter.nextFloat();
        
        System.out.print("Ingrese sus horas trabajadas a la semana: ");
        horas = enter.nextFloat();
        
        total = sueldo/horas;
        System.out.println("Su sueldo es de: Q."+sueldo);
        System.out.println("Sus horas laboradas fueron: "+horas);
        System.out.println("Su sueldo por hora laborada es de: Q."+total);
    }
}
