package vectores;

import java.util.Random;

/*En un vector de números enteros queremos poner 
al principio todos los números impares y al final 
los números pares conservando ambos su orden 
relativo en el vector original. Diseñar una función 
que obtenga el vector según se ha indicado anteriormente. */
public class Ej11VectorOrdenado {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector: ");
        int n = Validaciones.validacionEntero(0);
        int[] vector = new int[n];
        vector = llenarVector(vector);
        System.out.println("VECTOR GENERADO");
        System.out.println(mostrarVector(vector));
        System.out.println("ORDENANDO VECTOR...");
        System.out.println("VECTOR ORDENADO");
        vector = detectandoDivisores(vector);
        System.out.println(mostrarVector(vector));
    }

    public static int[] detectandoDivisores(int[] vector) {
        int[] salida = new int[vector.length];
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (vector[i] % 2 == 1) {
                salida[j] = vector[i];
                j++;
            }
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                salida[j] = vector[i];
                j++;
            }
        }
        return salida;
    }

    public static int[] llenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10);
        }
        return vector;
    }

    public static StringBuilder mostrarVector(int[] vector) {
        StringBuilder salida = new StringBuilder();
        salida.append("[");
        for (int i = 0; i < vector.length; i++) {
            salida.append(vector[i]);
            if (i < vector.length - 1) {
                salida.append(" , ");
            }
        }
        salida.append("]");
        return salida;
    }
}
