package matrices;

import java.util.Random;

/*Dado una matriz A de tamaño n x m  
encuentre si existe el punto silla, 
se denomina punto silla aquel elemento 
que es el mayor de la fila y el menor de la columna. */
public class Ej11PuntoSilla {

    public static void main(String[] args) {
        System.out.println("Ingresa la cantidad de filas de la matriz: ");
        int filas = Validaciones.validacionEntero(0);
        System.out.println("Ingresa la cantidad de columnas de la matriz: ");
        int columnas = Validaciones.validacionEntero(0);
        int[][] matriz = new int[filas][columnas];
        System.out.println("LLenando la matriz");
        matriz = llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("EXISTE PUNTO SILLA?");
        puntoSilla(matriz);
    }

    public static void puntoSilla(int[][] matriz) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[] maximoFilas = new int[matriz.length];
        int[] minimoColumnas = new int[matriz[0].length];
        for (int i = 0; i < maximoFilas.length; i++) {
            maximoFilas[i] = max;
        }
        for (int i = 0; i < minimoColumnas.length; i++) {
            minimoColumnas[i] = min;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] > maximoFilas[i]){
                    maximoFilas[i] = matriz[i][j];
                }
                if(matriz[i][j] < minimoColumnas[j]){
                    minimoColumnas[j] = matriz[i][j];
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (maximoFilas[i] == minimoColumnas[j]) {
                    System.out.println("Punto silla en: "+i+", "+j);
                }
            }
        }
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
