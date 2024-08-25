package vectores;

import java.util.Random;

/*Dados dos vectores A de n elementos y un vector B de n 
elementos, determinar cuántas veces la diferencia entre 
elementos iguales de los dos vectores es menor, igual 
o mayor a cero. Desplegar resultados. */
public class Ej15Diferencias2Vectores {

    public static void main(String[] args) {
        System.out.println("Ingresa la dimension de los vectores: ");
        int n = Validaciones.validacionEntero(0);
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        vector1 = llenarVector(vector1);
        vector2 = llenarVector(vector2);
        System.out.println("VECTOR 1");
        mostrarVector(vector1);
        System.out.println("VECTOR 2");
        mostrarVector(vector2);
        int[] salida = diferencias(vector1, vector2);
        System.out.println("Ceros: "+salida[0]);
        System.out.println("Mayores a cero: "+salida[1]);
        System.out.println("Menores a cero: "+salida[2]);
    }

    public static int[] diferencias(int[] vector1, int[] vector2) {
        int[] diferencia = new int[3];
        for (int i = 0; i < vector1.length; i++) {
            int dif = vector1[i] - vector2[i];
            if (dif == 0) {
                diferencia[0]++;
            } else {
                if (dif > 0) {
                    diferencia[1]++;
                } else {
                    diferencia[2]++;
                }
            }
        }
        return diferencia;
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
