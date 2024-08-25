package vectores;

import java.util.Random;

/*Dados dos vectores A y B de N elementos cada uno y multiplique el primer elemento 
de A con el último elemento de B y luego el segundo elemento de A por el N-1 
elemento de B y así sucesivamente hasta llegar al N elemento de A por el primer 
elemento de B. El resultado de la multiplicación almacenarlo en un vector C. */
public class Ej8MultiplicarVectoresAyB {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension de los 2 vectores: ");
        int dimension = Validaciones.validacionEntero(0);
        int[] vectorA = new int[dimension];
        int[] vectorB = new int[dimension];
        vectorA = llenarVector(vectorA);
        vectorB = llenarVector(vectorB);
        System.out.println("VECTOR A ");
        System.out.println(mostrarVector(vectorA));
        System.out.println("VECTOR B");
        System.out.println(mostrarVector(vectorB));
        System.out.println("VECTOR RESULTANTE");
        int[] vectorC = multiplicarAyB(vectorA, vectorB);
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

    public static int[] multiplicarAyB(int[] vectorA, int[] vectorB) {
        int[] vectorC = new int[vectorA.length];
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] * vectorB[vectorB.length - i-1];
        }
        return vectorC;
    }
}
