package laboratorio3;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int a, b, c, p = 2;
        float sub, sub1, sub2, sub3, sub4, sub5;
        float subtotal, total1, total2;

        System.out.print("Ingrese el valor de a: ");
        a = (int) enter.nextFloat();
        System.out.print("Ingrese el valor de b: ");
        b = (int) enter.nextFloat();
        System.out.print("Ingrese el valor de c: ");
        c = (int) enter.nextFloat();

        sub = (float) pow(b, p); //b^2
        sub1 = 4 * a * c;
        sub2 = sub - sub1; //b^2-4ac
        sub3 = (float) sqrt(sub2); //raíz(b^2-4ac)

        sub4 = -b - sub3; //-b-raíz(b^2-4ac)
        sub5 = -b + sub3; //-b+raíz(b^2-4ac)

        subtotal = 2 * a;

        total1 = sub4 / subtotal; //-b-raíz(b^2-4ac)/2a
        total2 = sub5 / subtotal; //-b+raíz(b^2-4ac)/2a

        System.out.println("Resultado 1: " + total1);
        System.out.println("Resultado 2: " + total2);
    }
}
