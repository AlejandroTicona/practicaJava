package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlMenos1Positivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0, n2 = 0;
        try {
            System.out.println("Ingresa el numero 1: ");
            n1 = sc.nextFloat();
            System.out.println("Ingresa el numero 2: ");
            n2 = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar 2 numeros");
            return;
        }
        if (n1 > 0 || n2 > 0) {
            System.out.println("Los numeros son " + n1 + " y " + n2);
        } else {
            System.out.println("Ni uno de los 2 numeros es positivo");
        }
    }
}
