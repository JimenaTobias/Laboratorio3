package laboratorio3;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Ejercicio6 {
// (a + b)^2 = a^2 + b^2 + 2ab

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int a, b, result, resul, tot, tot1, total;
        int c = 2;

        System.out.println("CALCULAR LA SUMA DE UN CUADRADO");
        System.out.print("Ingrese el valor de a: ");
        a = (int) enter.nextFloat();
        System.out.print("Ingrese el valor de b: ");
        b = (int) enter.nextFloat();

        resul = a+b;
        result = (int) pow(resul,c);
        tot = (int) (pow(a,c) + pow(b,c));
        tot1 = 2 * a * b;
        total = tot + tot1;

        System.out.println("COMPARACIÓN DE RESULTADOS");
        System.out.println(" El resultado de (a+b)^2 es: " + result);
        System.out.println(" El resultado de (a^2+b^2+2ab) es: " + total);
    }
}
