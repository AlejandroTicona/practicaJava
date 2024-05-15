package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplicacion3 {

    /*Que tome tres números y diga si la multiplicación 
    de los dos primeros es igual al tercero.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;
        try {
            System.out.println("Ingresa el numero 1: ");
            n1 = sc.nextFloat();
            System.out.println("Ingresa el numero 2: ");
            n2 = sc.nextFloat();
            System.out.println("Ingresa el numero 3: ");
            n3 = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar numeros: ");
            return;
        }
        if ((n1 * n2) == n3) {
            System.out.println("La multiplicacion de los 2 primeros digitos equivale al tercero");
        } else {
            System.out.println("La multiplicacion de los 2 primeros digitos no equivale al tercero");
        }

    }
}
