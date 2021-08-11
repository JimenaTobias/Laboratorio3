package laboratorio3;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int semanas, dias, horas, horast;

        System.out.print("Ingrese una cantidad en horas: ");
        horast = (int) enter.nextFloat();

        semanas = horast / 168;
        dias = horast % 168 / 24;
        horas = (horast % 168) % 24;

        System.out.println(+horast + " horas equivalen a:");
        System.out.println(" "+semanas + " semanas, " + dias + " días y " + horas + " horas.");
    }
}
