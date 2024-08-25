package vectores;

import java.util.Random;

/*Llenar dos vectores A y B de N elementos cada uno, sumar el elemento de la primera 
posición del vector A con el elemento de la primera posición del vector B y así 
sucesivamente hasta N, almacenar el resultado en un vector C, e imprimir el vector 
resultante. */
public class Ej9Suma2Vectores {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension de los vectores: ");
        int n = Validaciones.validacionEntero(0);
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        vectorA = llenarVector(vectorA);
        vectorB = llenarVector(vectorB);
        System.out.println("VECTOR A");
        System.out.println(mostrarVector(vectorA));
        System.out.println("VECTOR B");
        System.out.println(mostrarVector(vectorB));
        System.out.println("SUMA DE LOS DOS VECTORES");
        int[] vectorC = sumarVectores(vectorA, vectorB);
        System.out.println(mostrarVector(vectorC));

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

    public static int[] sumarVectores(int[] vectorA, int[] vectorB) {
        int[] vectorC = new int[vectorA.length];
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        return vectorC;
    }
}
