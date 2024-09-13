package matrices;

import java.util.Random;
import java.util.Scanner;

/*Lea dos matrices de orden N x M y 
a) genere una tercera con la suma de ambas 
b) genere una tercera con la multiplicación de ambas, si es posible. 
Para cada caso anterior, muestre la matriz resultante.*/
public class Ej7SumaMultiplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las filas de la matriz:");
        int filas = Validaciones.validacionEntero(0);
        System.out.println("Ingrese las columnas de la matriz: ");
        int columnas = Validaciones.validacionEntero(0);
        int[][] matriz1 = new int[filas][columnas];
        matriz1 = llenarMatriz(matriz1);
        System.out.println("MATRIZ 1 GENERADA");
        mostrarMatriz(matriz1);
        int[][] matriz2 = new int[filas][columnas];
        matriz2 = llenarMatriz(matriz2);
        System.out.println("MATRIZ 2 GENERADA");
        mostrarMatriz(matriz2);
        boolean isSelect = false;
        System.out.println("Ingrese una de las 2 opciones");
        while (!isSelect) {
            System.out.println("a) suma las matrices");
            System.out.println("b) multiplica las matrices");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "a":
                    System.out.println("LA SUMA ES: ");
                    mostrarMatriz(sumaMatrices(matriz1, matriz2));
                    break;
                case "b":
                    System.out.println("LA MULTIPLICACION ES: ");
                    mostrarMatriz(multiplicacionMatrices(matriz1, matriz2));
                    break;
                default:
                    System.out.println("Debe ingresar una opcion valida(a - b)");
            }
        }
    }

    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] matriz3 = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matriz3;
    }
    
    public static int[][]multiplicacionMatrices(int[][] matriz1, int[][] matriz2){
        int filas = matriz1.length;
        int columnas = matriz2[0].length;
        int matriz3[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
            }
            
        }
        return matriz3;
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
