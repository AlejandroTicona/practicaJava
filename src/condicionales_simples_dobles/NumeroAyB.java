package condicionales_simples_dobles;

import java.util.Scanner;

public class NumeroAyB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa a: ");
        int a = sc.nextInt();
        System.out.println("Ingresa b: ");
        int b = sc.nextInt();
        //validacion de numeros enteros positivos
        if (a > 0 && b > 0 && a % 1 == 0 && b % 1 == 0) {
            if (a % b == 0) {
                System.out.println(a + " es divisible por " + b);
            } else if (b % a == 0) {
                System.out.println(b + " es divisible por " + a);
            } else {
                System.out.println("Los numeros ingresados no son divibles entre si");
            }
        } else {
            System.out.println("Los numeros ingresados no son enteros positivos");
        }
    }
}
