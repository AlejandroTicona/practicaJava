package matrices;

import java.util.Random;

/*Realice y represente mediante un programa que lea un arreglo de M filas y N 
columnas y que calcule la suma de los elementos de la diagonal principal. */
public class Ej4SumaDiagonalPrincipal {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de filas: ");
        int filas = Validaciones.validacionEntero(0);
        System.out.println("Ingrese la cantidad de columnas");
        int columnas = Validaciones.validacionEntero(0);
        int[][] matriz = new int[filas][columnas];
        matriz = llenarMatriz(matriz);
        System.out.println("LLENANDO MATRIZ...");
        mostrarMatriz(matriz);
        System.out.println("LA SUMA DE LOS DIAGONALES ES: ");
        int suma = sumandoDiagonales(matriz);
        System.out.println("La suma de la diagonal principal es: " + suma);
    }

    public static int sumandoDiagonales(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length && i < matriz[0].length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            salida.append("[");
            for (int j = 0; j < matriz[0].length; j++) {
                salida.append(matriz[i][j]);
                if (j < matriz[0].length - 1) {
                    salida.append(" , ");
                }
            }
            salida.append("]\n");
        }
        System.out.println(salida);
    }
}
