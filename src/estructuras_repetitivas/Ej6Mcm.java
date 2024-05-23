package estructuras_repetitivas;

import java.util.Scanner;

public class Ej6Mcm {

    /*Hallar minimo comun multiplo de dos números 
    enteros positivos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean sonNumeros = false;
        System.out.println("MINIMO COMUN MULTIPLO");
        while (!sonNumeros) {
            System.out.println("Ingrese un numero entero positivo: ");
            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
                System.out.println("Ingrese otro numero entero positvo: ");
                if (sc.hasNextInt()) {
                    num2 = sc.nextInt();
                    if (num1 > 0 && num2 > 0) {
                        sonNumeros = true;
                    } else {
                        System.out.println("Debe ingresar numeros positivos");
                    }
                } else {
                    System.out.println("Debe ingresar un numero entero");
                    sc.next();
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }

        System.out.println("El Minimo Comun Multiplo es: " + mcm(num1, num2));
    }

    public static int mcm(int num1, int num2) {
        return ((num1 * num2) / (mcd(num1, num2)));
    }

    public static int mcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }
}
