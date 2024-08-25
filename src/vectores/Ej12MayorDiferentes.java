package vectores;

import java.util.Random;

/*
Llenar un vector de N elementos, imprimir 
la posición y el valor del elemento mayor 
almacenado en el vector. Suponga que todos los 
elementos del vector son diferentes. 
 */
public class Ej12MayorDiferentes {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector");
        int num = Validaciones.validacionEntero(0);
        int[] vector = new int[num];
        vector = llenarVector(vector);
        System.out.println(mostrarVector(vector));
        int[] salida = posicionValorMayor(vector);
        System.out.println("El mayor elemento esta en la posicion: " + salida[0]);
        System.out.println("El elemento es: " + salida[1]);
    }



    /**
     * The function returns an array in which the first element is the position
     * of the largest value and the second is the value.
     */
    public static int[] posicionValorMayor(int[] vector) {
        int[] mayor = new int[2];
        mayor[0] = Integer.MIN_VALUE;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor[1]) {
                mayor[0] = i + 1;
                mayor[1] = vector[i];
            }
        }
        return mayor;
    }

    public static int[] llenarVector(int[] vector) {
        Random random = new Random();
        int aleatorio;
        boolean isUnique;

        for (int i = 0; i < vector.length; i++) {
            do {
                aleatorio = random.nextInt(100);
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (vector[j] == aleatorio) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            vector[i] = aleatorio;
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
