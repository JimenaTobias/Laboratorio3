package laboratorio3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        final int salario = 1000;
        final int com = 150;
        final int precio = 45000;
        final float porcentaje = (float) 0.05;
        int cantidad, comision, venta, sueldo;

        System.out.print("Ingrese la cantidad de autos vendidos en el mes: ");
        cantidad = (int) enter.nextFloat();

        comision = cantidad * com;
        venta = (int) (cantidad * precio * porcentaje);
        sueldo = venta + comision + salario;
        
        System.out.println("El sueldo mensual del empleado es de: Q." + sueldo);
    }
}
