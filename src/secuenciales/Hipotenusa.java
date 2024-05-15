package secuenciales;

import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el co: ");
        float co = sc.nextFloat();
        System.out.println("Ingresa el ca: ");
        float ca = sc.nextFloat();
        float h = (float) Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
        System.out.println("La hipotenusa es de " + h);
    }
}
