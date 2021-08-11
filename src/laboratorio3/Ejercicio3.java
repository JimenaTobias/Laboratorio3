package laboratorio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        float r, a, e, total;

        System.out.print("Ingrese una cantidad: ");
        r = enter.nextFloat();
        System.out.println("Rodrigo tiene: Q." + r);

        a = r / 2;
        System.out.println("Andrea tiene: Q." + a);

        e = ((r + a) / 2);
        System.out.println("Esteban tiene: Q." + e);

        total = r + a + e;
        System.out.println("Los tres tienen un total de: Q." + total);
    }
}
