package matrices;

/*Realice un programa que determine si una matriz es de tipo diagonal: es una matriz 
cuadrada se denomina matriz diagonal si todos sus elementos son cero, excepto los 
elementos de la diagonal principal.  */
public class Ej6MatrizDiagonal {

    public static void main(String[] args) {
        System.out.println("Ingresa la dimension de la matriz, considera que es una matriz cuadrada: ");
        int n = Validaciones.validacionEntero(0);
        int[][] matriz = new int[n][n];
        matriz = llenarMatriz(matriz);
        System.out.println("MATRIZ GENERADA");
        mostrarMatriz(matriz);
        System.out.println("VALIDANDO SI ES UNA MATRIZ DIAGONAL...");
        if (validacionMatrizDiagonal(matriz)) {
            System.out.println("La matriz es diagonal");
        } else {
            System.out.println("La matriz no es diagonal");
        }
    }

    public static boolean validacionMatrizDiagonal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("fila: " + i + " columna " + j + " :");
                matriz[i][j] = Validaciones.validacionEntero(-1);
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
