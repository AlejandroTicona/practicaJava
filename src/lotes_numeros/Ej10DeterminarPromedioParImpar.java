package lotes_numeros;

import java.util.Scanner;

/*Dado un conjunto de n números determinar el promedio 
de los pares y los impares.*/
public class Ej10DeterminarPromedioParImpar {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        int[] salida = promedioParImpar(numero);
        System.out.println("El promedio de los impares es: " + salida[1] + "\nEl promedio de los pares es: " + salida[0]);
    }

    public static int[] promedioParImpar(int num) {
        Scanner sc = new Scanner(System.in);
        int[] salida = new int[2];
        int n = 0, c_impar = 0, c_par = 0, suma_par = 0, suma_impar = 0;
        System.out.println("Ingrese los " + num + " numeros del lote: ");
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                c_par++;
                suma_par += n;
            } else {
                c_impar++;
                suma_impar += n;
            }
        }
        salida[0] = suma_par /= c_par;
        salida[1] = suma_impar /= c_impar;
        return salida;
    }

}
