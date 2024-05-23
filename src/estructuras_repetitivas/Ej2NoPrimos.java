package estructuras_repetitivas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2NoPrimos {

    /*Dado un número n positivo entero, se desea mostrar 
    todos los números no primos anteriores a n.*/
    //metodo principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingresa un numero entero positivo: ");
        try {
            numero = sc.nextInt();
            if (numero <= 0) {
                System.out.println("Debe ingresar un numero positivo");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero positivo");
        }

        for (int i = 1; i < numero; i++) {
            if (noPrimo(i)) {
                System.out.println(i + " no es primo");
            }
        }
        sc.close();
    }
    //metodo noPrimo que detecta no primos

    public static boolean noPrimo(int num) {
        if (num <= 1) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
