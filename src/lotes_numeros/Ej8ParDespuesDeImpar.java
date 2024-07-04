package lotes_numeros;

import java.util.Scanner;

/*Leer un lote de N números hasta 
que ingrese un numero negativo, 
determinar cuántas veces un numero 
par esta seguido de un número impar.*/
public class Ej8ParDespuesDeImpar {

    public static void main(String[] args) {
        System.out.println("La cantidad de pares seguidos por impares es de: " + contador());
    }

    public static int contador() {
        Scanner sc = new Scanner(System.in);
        int n, c = 0;
        boolean sw = false;
        boolean isNegative = false;
        System.out.println("Ingresa el lote de numeros: ");
        while (!isNegative) {
            n = sc.nextInt();
            if (n < 0) {
                isNegative = true;
            }
            if (sw == true && n % 2 == 1) {
                c++;
                sw = false;
            }
            if (n % 2 == 0) {
                sw = true;
            }
        }

        return c;
    }
}
