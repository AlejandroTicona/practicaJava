package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Impares3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0, n2 = 0, n3 = 0;
        try {
            System.out.println("Ingresa el numero 1: ");
            n1 = sc.nextFloat();
            System.out.println("Ingresa el numero 2: ");
            n2 = sc.nextFloat();
            System.out.println("Ingresa el numero 3: ");
            n3 = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar solo numeros");
            return;
        }
        if (n1 > 0 && n2 > 0 && n3 > 0) {
            if (n1 % 2 == 1 || n2 % 2 == 1 || n3 % 2 == 1) {
                if (n1 % 2 == 1 && n1 > n2 && n1 > n3) {
                    System.out.println("El mayor impar es " + n1);
                } else if (n2 % 2 == 1 && n2 > n1 && n2 > n3) {
                    System.out.println("El mayor impar es " + n2);
                } else {
                    System.out.println("El mayor impar es " + n3);
                }
            } else {
                System.out.println("Todos son pares");
            }
        } else {
            System.out.println("Todos los numeros deben ser positivos");
        }
    }
}
