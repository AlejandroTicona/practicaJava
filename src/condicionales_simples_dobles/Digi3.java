package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Digi3 {

    /*. Dado un número si tiene tres dígitos 
    hallar la suma de sus dígitos. 
    Caso contrario hallar el doble del número.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n = 0, resultado = 0;
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero");
            return;
        }
        if (n >= 100 && n <= 999) {
            resultado = ((n / 100) + ((n % 100)/10) + (n % 10));
            System.out.println("La suma de los digitos es de : " + resultado);
        } else {
            System.out.println("El doble del numero es " + (n * 2));
        }
    }
}
