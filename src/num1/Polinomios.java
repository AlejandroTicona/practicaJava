package num1;

import java.util.Scanner;

public class Polinomios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa a1: ");
        float a1 = sc.nextFloat();
        System.out.println("Ingresa b1: ");
        float b1 = sc.nextFloat();
        System.out.println("Ingresa c1: ");
        float c1 = sc.nextFloat();
        System.out.println("Ingresa a2: ");
        float a2 = sc.nextFloat();
        System.out.println("Ingresa b2: ");
        float b2 = sc.nextFloat();
        System.out.println("Ingresa c2: ");
        float c2 = sc.nextFloat();

        System.out.println("Suma de polinomios: " + (a1 + a2) + "x^2 +" + (b1 + b2) + "x + " + (c1 + c2));
        System.out.println("Resta de polinomios: " + (a1 - a2) + "x^2 +" + (b1 - b2) + "x + " + (c1 - c2));
        System.out.println("Multiplicacion de polinomios: " + (a1 * a2) + "x^2 +" + (b1 * b2) + "x + " + (c1 * c2));

    }
}
