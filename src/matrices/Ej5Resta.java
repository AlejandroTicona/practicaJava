package matrices;

import java.util.Random;

/*Realice un algoritmo para obtener una matriz como el 
resultado de la resta de dos matrices A y B de tamaño m x n. */
public class Ej5Resta {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de filas: ");
        int filas = Validaciones.validacionEntero(0);
        System.out.println("Ingrese la cantidad de columnas: ");
        int columnas = Validaciones.validacionEntero(0);
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        matrizA = llenarMatriz(matrizA);
        matrizB = llenarMatriz(matrizB);
        System.out.println("MATRIZ A");
        mostrarMatriz(matrizA);
        System.out.println("MATRIZ B");
        mostrarMatriz(matrizB);
        System.out.println("MATRIZ RESULTANTE");
        int[][] matriz = restarMatriz(matrizA, matrizB);
        mostrarMatriz(matriz);
    }

    public static int[][] restarMatriz(int[][] matriz1, int[][] matriz2){
        int[][] matriz = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return matriz;
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
