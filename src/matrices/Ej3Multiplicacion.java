package matrices;

import java.util.Random;

/*Realice y represente mediante un programa para obtener el 
producto de dos matrices de orden M x N. */
public class Ej3Multiplicacion {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de filas: ");
        int filas = Validaciones.validacionEntero(0);
        System.out.println("Ingrese la cantidad de columnas: ");
        int columnas = Validaciones.validacionEntero(0);
        int[][] vector1 = new int[filas][columnas];
        int[][] vector2 = new int[filas][columnas];
        vector1 = llenarMatriz(vector1);
        vector2 = llenarMatriz(vector2);
        System.out.println("Matriz 1");
        mostrarMatriz(vector1);
        System.out.println("Matriz 2");
        mostrarMatriz(vector2);
        System.out.println("MULTIPLICANDO");
        int[][] matrizFinal = multiplicarMatrices(vector1, vector2);
        mostrarMatriz(matrizFinal);
    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int fila = matriz1.length;
        int columna = matriz1[0].length;
        int[][] matrizFinal = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrizFinal[i][j] = matriz1[i][j] * matriz2[i][j];
            }

        }
        return matrizFinal;
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
