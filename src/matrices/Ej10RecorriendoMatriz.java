package matrices;

import java.util.Scanner;

/*Llenar la primera columna de una matriz A de dimensión N*M  
y aplicar la rotación por columnas M-1 veces para llenar el 
resto de la matriz. 
Ejemplo para N=5 y M=4.*/
public class Ej10RecorriendoMatriz {

    public static void main(String[] args) {
        System.out.println("Digite la cantidad de filas: ");
        int filas = Validaciones.validacionEntero(0);
        System.out.println("Digite la cantidad de columnas: ");
        int columnas = Validaciones.validacionEntero(0);
        int[][] matriz = new int[filas][columnas];
        matriz = llenarColumna(matriz);
        System.out.println("La matriz es: ");
        mostrarMatriz(matriz);
        System.out.println("Rotando las siguientes columnas: ");
        matriz = rotacion(matriz);
        mostrarMatriz(matriz);
    }

    public static int[][] llenarColumna(int[][] matriz){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingresa el valor "+(i+1)+" de la columnas 1: "); 
            matriz[i][0] = sc.nextInt();
        }
        return matriz;
    }
    public static int[][] rotacion(int[][] matriz){
        int columnas = matriz[0].length;
        int filas = matriz.length;
        for (int j = 1; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                matriz[i][j] = matriz[(i+1)%filas][j-1];
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
