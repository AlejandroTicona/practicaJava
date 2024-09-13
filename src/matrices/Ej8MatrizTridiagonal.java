package matrices;

import java.util.Scanner;

/*Dado una matriz cuadrada con dimensión n >3, determinar si la matriz es una matriz 
tridiagonal; se denomina matriz tridiagonal a una matriz donde sus elementos son cero 
excepto los elementos de la diagonal principal y las diagonales adyacentes por encima 
y por debajo de la misma. */
public class Ej8MatrizTridiagonal {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de filas y columnas: ");
        int n = Validaciones.validacionEntero(3);
        int[][] matriz = new int[n][n];
        matriz = llenarVector(matriz);
        System.out.println("MATRIZ");
        mostrarVector(matriz);
        if(esTridiagonal(matriz)){
            System.out.println("La matriz es tridiagonal");
        }else{
            System.out.println("La matriz no es tridiagonal");
        }

    }

    public static boolean esTridiagonal(int[][] matriz) {
        /*int a1 = 1, b1 = 0, a2 = 0, b2 = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (((i != j) || (i != a1 && j != b1) || (i != a2 && j != b2)) && (matriz[i][j] != 0)) {
                    return false;
                } else {
                    if (i == a1 && i == b1) {
                        a1++;
                        b1++;
                    } else if (i == a2 && j == b2) {
                        a2++;
                        b2++;
                    }
                }
            }
        }*/
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j != i && j != i - 1 && j!= i +1){
                    if (matriz[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int[][] llenarVector(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese el elemento (" + i + "," + j + "):");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static void mostrarVector(int[][] matriz) {
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
