package estructuras_repetitivas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1Divisores {

    /*EMPEZAREMOS A NUMERAR LOS EJERCICIOS PARA MEJOR LECTURA*/
 /*Introducir un numero n entero y positivo luego mostrar sus divisores positivos*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, c = 1;
        System.out.println("Ingresa un numero: ");
        try {
            numero = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero positivo");
            return;
        }
        while (numero >= c) {
            if (numero % c == 0 && c < numero - 1) {
                System.out.print(c + ", ");
            } else if (c == numero) {
                System.out.print("y " + numero + "\n");
            }
            c++;
        }
//falta eliminar la ulitma coma
    }
}
