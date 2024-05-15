package secuenciales;

import java.util.Scanner;

public class Valoress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, d;
        System.out.println("Ingresa el valor de a: ");
        a = sc.nextFloat();
        System.out.println("Ingresa el valor de b: ");
        b = sc.nextFloat();
        c = (float) (((5) * (Math.pow(a, 2)) * (Math.pow(b, 3))) + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));
        d = (float) ((Math.sqrt((4) * (a) * (Math.pow(b, 2)))) + Math.pow((a + b), 2));
        System.out.println("El valor de a es: " + c);
        System.out.println("El valor de b es: " + d);

    }
}
