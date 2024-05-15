package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CantidadDigitos {

    /*Dado un número entero positivo indicar si tiene un 
    digito, dos dígitos, tres dígitos, cuatro dígitos o 
    mostrar un mensaje que diga el número es un entero largo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, nc = 0;
        try {
            System.out.println("Ingresa un numero entero: ");
            numero = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Solo se admiten numeros enteros!");
            return;
        }
        if (numero / 1000 > 0) {
            nc = 4;
        } else if (numero / 100 > 0) {
            nc = 3;
        } else if (numero / 10 > 0) {
            nc = 2;
        } else if (numero / 1 > 0) {
            nc = 1;
        }
        switch (nc) {
            case (1):
                System.out.println("El numero tiene un digito");
                break;
            case (2):
                System.out.println("El numero tiene dos digitos");
                break;
            case (3):
                System.out.println("El numero tiene tres digitos");
                break;
            case (4):
                System.out.println("El numero tiene cuatro digitos");
                break;
            default:
                System.out.println("El numero es un entero largo");
                break;
        }
    }
}
