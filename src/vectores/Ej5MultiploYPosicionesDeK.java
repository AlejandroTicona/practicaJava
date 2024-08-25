package vectores;

import java.util.Random;

/*Leer un vector A de n elementos, 
desplegar los múltiplos de k y las posiciones que 
ocupan.*/
public class Ej5MultiploYPosicionesDeK {

    public static void main(String[] args) {
        System.out.println("Ingresa la dimension del vector: ");
        int dimension = Validaciones.validacionEntero(0);
        int[] vector = new int[dimension];
        vector = llenarVector(vector);
        mostrarVector(vector);
        System.out.println("Ingresa K: ");
        int k = Validaciones.validacionEntero(0);
        int[] posiciones = posiciones(vector, k);
        int[] digitos = digitos(vector, k);
        System.out.println("Los digitos son: ");
        mostrarVector(digitos);
        System.out.println("Las posiciones son: ");
        mostrarVector(posiciones);

    }

    public static int[] digitos(int[] vector, int k) {
        int dimension = cantidadDeMultiplos(vector, k);
        int[] vectorPosiciones = new int[dimension];
        int index = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % k == 0) {
                vectorPosiciones[index] = vector[i];
                index++;
            }
        }
        return vectorPosiciones;
    }

    public static int[] posiciones(int[] vector, int k) {

        int dimension = cantidadDeMultiplos(vector, k);
        int[] vectorPosiciones = new int[dimension];
        int index = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % k == 0) {
                vectorPosiciones[index] = i+1;
                index++;
            }
        }
        return vectorPosiciones;
    }

    public static int cantidadDeMultiplos(int[] vector, int k) {
        int c = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % k == 0) {
                c++;
            }
        }
        return c;
    }

    public static int[] llenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
        return vector;
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println("");
    }
}
