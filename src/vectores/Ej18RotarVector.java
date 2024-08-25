package vectores;

import java.util.Random;

/*Dado un vector A de n elementos, 
hacer rotar hacia la derecha k-veces*/
public class Ej18RotarVector {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector: ");
        int dimension = Validaciones.validacionEntero(0);
        int[] vector = new int[dimension];
        vector = llenarVector(vector);
        System.out.println("EL VECTOR ES: ");
        mostrarVector(vector);
        System.out.println("Ingrese la cantidad de rotaciones a la derecha: ");
        int k = Validaciones.validacionEntero(0);
        vector = rotarVector(vector, k);
        System.out.println("El vector rotado es: ");
        mostrarVector(vector);
    }

    public static int[] rotarVector(int[] vector, int posiciones) {
        int ultimo;
        for (int vuelta = 1; vuelta <= posiciones; vuelta++) {
            ultimo = vector[vector.length - 1];
            for (int i = vector.length - 2; i >= 0; i--) {
                vector[i + 1] = vector[i];
            }
            vector[0] = ultimo;
        }
        return vector;
    }

    public static int[] llenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10);
        }
        return vector;
    }

    public static void mostrarVector(int[] vector) {
        StringBuilder salida = new StringBuilder();
        salida.append("[");
        for (int i = 0; i < vector.length; i++) {
            salida.append(vector[i]);
            if (i < vector.length - 1) {
                salida.append(" , ");
            }
        }
        salida.append("]");
        System.out.println(salida);
    }
}
