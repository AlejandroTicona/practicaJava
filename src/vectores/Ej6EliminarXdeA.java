package vectores;

import java.util.Random;

/*Se tiene un vector A de n elementos, 
eliminar el elemento X que se encuentra en el 
vector*/
public class Ej6EliminarXdeA {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector: ");
        int dimension = Validaciones.validacionEntero(0);
        int[] vector = new int[dimension];
        vector = fillVector(vector);
        System.out.println("El vector es: ");
        System.out.println(showVector(vector));
        System.out.println("Ingrese el digito a eliminar");
        int x = Validaciones.validacionEntero(0);
        vector = eliminandoX(vector, x);
        System.out.println(showVector(vector));
    }

    public static int[] eliminandoX(int[] vector, int x) {
        int c = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == x) {
                vector[i] = 0;
                c++;
            }
        }
        int dimension = vector.length - c, index = 0;
        int[] vector_final = new int[dimension];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 0) {
                vector_final[index] = vector[i];
                index++;
            }
        }
        return vector_final;
    }

    public static StringBuilder showVector(int[] vector) {
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

    public static int[] fillVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10);
        }
        return vector;
    }
}
