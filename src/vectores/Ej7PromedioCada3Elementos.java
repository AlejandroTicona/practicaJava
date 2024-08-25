package vectores;

import java.util.Random;

/*Si se tiene un vector A de n elementos, 
hallar el promedio de cada tres elementos, 
desplegar el vector. */
public class Ej7PromedioCada3Elementos {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector: ");
        int n = Validaciones.validacionEntero(0);
        int[] vector = new int[n];
        vector = llenarVector(vector);
        System.out.println("Vector inicial: ");
        System.out.println(mostrarVector(vector));
        System.out.println("PROMEDIO DE CADA 3 ELEMENTOS");
        float[] salida = promedio3Elementos(vector);
        System.out.println(mostrarVectorFloat(salida));
    }

    public static float[] promedio3Elementos(int[] vector) {
        int dimension = 0;
        if (vector.length % 3 == 0) {
            dimension = vector.length / 3;
        } else {
            dimension = (vector.length / 3) + 1;
        }
        float[] salida = new float[dimension];
        int index = 0, c = 0, suma = 0;
        for (int i = 0; i < vector.length; i++) {
            c++;
            suma += vector[i];
            if (c == 3 || i == vector.length - 1) {
                salida[index] = (float) (suma / 3.0);
                c = 0;
                index++;
                suma = 0;
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
    
    public static StringBuilder mostrarVectorFloat(float[] vector) {
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
