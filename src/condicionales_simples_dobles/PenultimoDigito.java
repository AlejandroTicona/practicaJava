package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PenultimoDigito {

    /*. Introducir un número n e imprimir el penúltimo digito
    Ejemplo si n=123 => se deberá mostrar 2
    n=43 => se deberá mostrar 4
    n=9 => se deberá mostrar “no tiene penúltimo digito”*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n = 0, r;
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar numeros enteros");
            return;
        }
        if (n > 0) {
            if (n > 9) {
                r = (n % 100) / 10;
                System.out.println("El penultimo digito es " + r);
            } else {
                System.out.println("No tiene penultimo digito");
            }
        } else {
            System.out.println("Debes ingresar un numero mayor a 0");
        }
    }
}
