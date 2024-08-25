package vectores;

import java.util.Random;

/*Determinar cuantos numeros primos hay en un vector*/
public class Ej4Primos {

    public static void main(String[] args) {
        int vector[];
        System.out.println("Ingrese la dimension del vector: ");
        int dimension = Validaciones.validacionEntero(0);
        vector = new int[dimension];
        vector = llenarVector(vector);
        System.out.println("EL VECTOR ES");
        mostrarVector(vector);
        System.out.println("LOS NUMEROS PRIMOS SON: ");
        detectando(vector);

    }

    public static void detectando(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (isPrimo(vector[i])) {
                System.out.print(vector[i] + " , ");
            }
        }
        System.out.println("");
    }

    public static void mostrarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println("");
    }

    public static int[] llenarVector(int vector[]) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            vector[i] = random.nextInt(100);
        }
        return vector;
    }

    public static boolean isPrimo(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
