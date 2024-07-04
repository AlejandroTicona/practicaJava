package lotes_numeros;

import java.util.Scanner;

/*Dado un conjunto de n números, se pide mostrar 
el promedio de cada tres números*/
public class Ej19Promedio3Numeros {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero3();
        promedioDe3(numero);
    }

    public static void promedioDe3(int num) {
        StringBuilder salida = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lote de " + num + " numeros: ");
        int numAnterior = sc.nextInt();
        int numActual = sc.nextInt();
        int numSiguiente = sc.nextInt();

        for (int i = 1; i <= num - 2; i++) {
            double promedio = (double) (numAnterior + numActual + numSiguiente) / 3;
            salida.append((int)promedio + ", ");
            numAnterior = numActual;
            numActual = numSiguiente;
            if (i < num - 2) {
                numSiguiente = sc.nextInt();
            }
        }
        System.out.println(salida);
    }
}
