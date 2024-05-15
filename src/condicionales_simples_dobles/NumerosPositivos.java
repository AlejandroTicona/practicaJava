package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPositivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0, n2 = 0;
        try {
            System.out.println("Ingrese el numero 1: ");
            n1 = sc.nextFloat();
            System.out.println("Ingrese el numero 1: ");
            n2 = sc.nextFloat();

        } catch (InputMismatchException e) {
            System.out.println("Solo son validos numeros");
            return;
        }

        if (n1 > 0) {
            System.out.println(n1 + " es positivo");
        }
        if (n2 > 0) {
            System.out.println(n2 + " es positivo");
        }
        if (n1 <= 0 && n2 <= 0) {
            System.out.println("Ninguno es positivo");
        }

    }
}
