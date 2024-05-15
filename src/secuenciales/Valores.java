package secuenciales;

import java.util.Scanner;

public class Valores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, d;
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextFloat();

        c = (float) ((((4)*(Math.pow(a,4))) + (3*a*b) + (Math.pow(b,2))) / ((Math.pow(a,2)) + (Math.pow(b,2))));
        d = (float) ((3 * Math.pow(c,2)) + a + Math.pow(b,2)) / (4);

        System.out.println("El valor de c es de: " + c + "\nEl valor de d es de: " + d);
    }
}
