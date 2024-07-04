package lotes_numeros;

import java.util.Scanner;

/*Dado un lote n números, se pide determinar: 
a. Cuantas veces un numero par esta seguido de dos impares. 
b. Cuantas veces un numero positivo esta 
seguido por un negativo y un cero*/
public class Ej17ParSeguidoImpares {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        contadoSeguidosPar(numero);
    }

    public static void contadoSeguidosPar(int num) {
        Scanner sc = new Scanner(System.in);
        StringBuilder salida = new StringBuilder();
        StringBuilder salida2 = new StringBuilder();
        int n, cn = 0, c = 0, c2 = 0;
        boolean sw1 = false, sw2 = false;
        System.out.println("Ingrese el lote de " + num + " elementos");
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            if (n % 2 == 0 && c == 2) {
                cn++;
                salida.append(n);
                c = 0;
                if (i < num) {
                    salida.append(", ");
                }
            }
            if (n % 2 == 1) {
                c++;
            } else {
                c = 0;
            }
            //encontrado b 
            if (n < 0) {
                sw1 = true;
            }
            if (n == 0 && sw1 == true) {
                sw2 = true;
                sw1=false;
            }
            if (sw2 == true && n > 0) {
                c2++;
                salida2.append(n + " , ");
                sw2 = false;
                sw1 = false;
            }
        }
        System.out.println("a) Los numeros pares seguidos de 2 impares son: \n" + salida);
        System.out.println("Hay " + cn + " numeros con esas caracteristicas");
        System.out.println("b) Los numeros positivos seguidos de un negativo y cero son: \n" + salida2);
        System.out.println("Hay " + c2 + " con esas caracteristicas");
    }
}
