package vectores;

import java.util.Random;

/*Realizar la suma de dos vectores considerando 
que son de distinta longitud. */
public class Ej21SumaVectoresDistintos {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector 1: ");
        int n1 = Validaciones.validacionEntero(0);
        System.out.println("Ingresa la dimension del vector 2: ");
        int n2 = Validaciones.validacionEntero(0);
        int[] vector1 = new int[n1];
        int[] vector2 = new int[n2];
        vector1 = llenarVector(vector1);
        vector2 = llenarVector(vector2);
        System.out.println("VECTOR1");
        mostrarVector(vector1);
        System.out.println("VECTOR2");
        mostrarVector(vector2);
        int[] vector3;
        if (n1 >= n2) {
            vector3 = sumandoVectores(vector1, vector2);
        } else {
            vector3 = sumandoVectores(vector2, vector1);
        }
        System.out.println("SUMA DE VECTORES");
        mostrarVector(vector3);
    }

    public static int[] sumandoVectores(int[] vectorMayor, int[] vectorMenor) {
        int[] vector = new int[vectorMayor.length];
        for (int i = 0; i < vectorMayor.length; i++) {
            if (i < vectorMenor.length - 1) {
                vector[i] = vectorMayor[i] + vectorMenor[i];
            } else {
                vector[i] = vectorMayor[i];

            }
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
