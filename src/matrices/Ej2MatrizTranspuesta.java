package matrices;

import java.util.Random;

public class Ej2MatrizTranspuesta {

    public static void main(String[] args) {
        System.out.println("Ingresa la cantidad de filas: ");
        int filas = Validaciones.validacionEntero(0);
        System.out.println("Ingresa la cantidad de columnas: ");
        int columnas = Validaciones.validacionEntero(0);
        int matriz[][] = new int[filas][columnas];
        System.out.println("Matriz generada");
        matriz = llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("TRANSPONIENDO MATRIZ");
        matriz = transponerMatriz(matriz);
        mostrarMatriz(matriz);
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matriz_transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz_transpuesta[j][i] = matriz[i][j];
            }
        }
        return matriz_transpuesta;
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Random random = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
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
