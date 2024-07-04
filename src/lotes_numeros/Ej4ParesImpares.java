package lotes_numeros;

import java.util.Scanner;

/*Leer un lote de N números, determinar cuántos números pares e 
impares hay en el lote*/
public class Ej4ParesImpares {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        int[] salida = parImpar(numero);
        System.out.println("La cantidad de pares es: "+salida[0]+"\nLa cantidad de impares es: "+salida[1]);
    }

    public static int[] parImpar(int numero) {
        Scanner sc = new Scanner(System.in);
        int[] salida = new int[2];
        int n;
        for (int i = 1; i <= numero; i++) {
            System.out.println("Ingrese el digito " + i);
            n = sc.nextInt();
            if (n % 2 == 0) {
                salida[0]++;
            } else {
                salida[1]++;
            }
        }
        return salida;
    }
}
