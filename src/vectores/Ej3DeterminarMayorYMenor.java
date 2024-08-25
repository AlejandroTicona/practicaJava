package vectores;

import java.util.Random;

/*Si se tiene un vector A con n elementos. 
Determinar el mayor y el menor*/
public class Ej3DeterminarMayorYMenor {

    public static void main(String[] args) {
        int[] vector;
        System.out.println("Ingresa la dimension del vector: ");
        int dimension = Validaciones.validacionEntero(0);
        vector = new int[dimension];
        vector = vectorAleatorio(vector);
        System.out.println("El vector es: ");
        mostrarVector(vector);
        System.out.println("El menor elemento es: " + menor(vector));
        System.out.println("El mayor elemento es: " + mayor(vector));
    }

    public static int menor(int[] vector) {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        return menor;
    }

    public static int mayor(int[] vector) {
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public static int[] vectorAleatorio(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
        return vector;
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if(i < vector.length - 1){
                System.out.print(" , ");
            }
        }
        System.out.println("");
    }
}
