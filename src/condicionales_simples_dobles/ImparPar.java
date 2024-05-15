package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImparPar {

    /*Dado un número si es impar mostrar el 
    siguiente impar caso contrario mostrar el 
    anterior par.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.println("Ingresa un numero: ");
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un numero");
            return;
        }
        if (n % 2 == 1) {
            System.out.println("El siguiente impar es: " + (n + 2));
        } else {
            System.out.println("El anterior par es: " + (n - 2));
        }
    }
}
