package matrices;

import java.util.Random;

/*Leer una matriz A de orden M x N y un número K. 
Multiplicar todos los elementos de la matriz por 
el número K. Mostrar la matriz resultante. */
public class Ej1Multiplicacion {

    public static void main(String[] args) {
        System.out.println("Ingresa la cantidad de filas: ");
        int filas = Validaciones.validacionEntero(0);
        System.out.println("Ingresa la cantidad de columnas: ");
        int columnas = Validaciones.validacionEntero(0);
        int[][] matriz = new int[filas][columnas];
        matriz = llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("Ingresa el multiplicador: ");
        int k = Validaciones.validacionEntero(0);
        matriz = multiplicarMatriz(matriz, k);
        mostrarMatriz(matriz);
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

    public static int[][] multiplicarMatriz(int[][] matriz, int multiplicando) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] *= multiplicando;
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
