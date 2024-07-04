package lotes_numeros;

import java.util.Scanner;

/*Dado un lote de n números determinar 
cuántos son primos, cuántos son pares y cuántos 
son impares. */
public class Ej3PrimosParesImpares {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        int[] resultados = determinador(numero);
        System.out.println("La cantidad de numeros primos es: " + resultados[0] + "\nLa cantidad de pares: " + resultados[1] + "\nLa cantidad de impares: " + resultados[2]);
    }

    //haremos la prueba devolviendo un array
    //la continuidad de los ejercicios
    //se fue de sabatico carino
    public static int[] determinador(int num) {
        Scanner sc = new Scanner(System.in);
        int[] salida = new int[3];
        int n;
        for (int i = 1; i <= num; i++) {
            System.out.println("Ingrese el numero " + i + ":");
            n = sc.nextInt();
            //calculando primos
            if(primo(n)){
                salida[0]++;
            }
            if (n % 2 == 0) {
                salida[1]++;
            } else {
                salida[2]++;
            }
        }
        return salida;
    }

    public static boolean primo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
