package estructuras_repetitivas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3Primo {

    /*Dado un numero entero positivo. 
    Determinar si el mismo es un numero primo*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Ingresa un numero entero positivo: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Debe ingresar un numero positivo");
                }
            } else {
                System.out.println("Debes ingresar un número entero positivo");
                sc.next();
            }
        }

        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es Primo felicidades!!!");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }

    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
