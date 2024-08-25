package vectores;

import java.util.Random;

/*Si se tiene un vector A con n elementos, 
insertar X después de cada valor impar 
Entrada Si n=6 y X=4*/
public class Ej2InsertarXdespuesDeImpar {

    public static void main(String[] args) {
        int[] vector;
        System.out.println("Ingresa la dimension del vector");
        int dimension = Validaciones.validacionEntero(0);
        System.out.println("Ingresa el numero a insertar despues de cada impar: ");
        int x = Validaciones.validacionEntero(0);
        vector = new int[dimension];
        vector = llenarVector(vector);
        mostrarVector(vector);
        int[] nuevoVector = vectorAumentado(vector, x);
        mostrarVector(nuevoVector);
    }

    public static int[] llenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10);
        }
        return vector;
    }

    public static int[] vectorAumentado(int[] vector, int x) {
        int impares = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 1) {
                impares++;
            }
        }
        int[] nuevoVector = new int[vector.length + impares];
        int index = 0;
        for (int i = 0; i < vector.length; i++) {
            nuevoVector[index] = vector[i];
            index++;
            if (vector[i] % 2 == 1) {
                nuevoVector[index] = x;
                index++;
            }
        }
        return nuevoVector;
    }

    public static void mostrarVector(int[] vector) {
        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < vector.length; i++) {
            salida.append(vector[i]);
            if (i < vector.length-1) {
                salida.append(" , ");
            }
        }
        System.out.println(salida);
    }

}
