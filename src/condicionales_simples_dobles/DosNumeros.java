package condicionales_simples_dobles;

import java.util.Scanner;

public class DosNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa a: ");
        float a = sc.nextFloat();
        System.out.println("Ingresa b: ");
        float b = sc.nextFloat();
        float r;
        if (a > b ) {
            a = a - b;
            System.out.println("El resultado es: " + a);
        } else {
            b = b - a;
            System.out.println("El resultado es: " + b);
        }
    }
    //se podria mejorar, pero de momento lo dejaré por aquí hasta que aprenda manejo de errores
}
