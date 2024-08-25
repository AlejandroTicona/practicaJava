package vectores;

import java.util.Random;

/*En un vector de números enteros queremos eliminar 
  los elementos repetidos guardando el resultado en el 
  mismo vector. Los elementos deben conservar su orden 
  relativo. 
  Para ello no se puede utilizar ningún vector auxiliar. 
 */
public class Ej13EliminarRepetidos {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector: ");
        int num = Validaciones.validacionEntero(0);
        int[] vector = new int[num];
        vector = llenarVector(vector);
        mostrarVector(vector);
        System.out.println("Eliminando repetidos");
        vector = eliminandoRepetidos(vector);
        mostrarVector(vector);
    }

    public static int[] eliminandoRepetidos(int[] vector) {
        int longitud = vector.length;

        for (int i = 0; i < longitud; i++) {
            for (int j = i + 1; j < longitud; j++) {
                if (vector[i] == vector[j]) {
                    for (int k = j; k < longitud - 1; k++) {
                        vector[k] = vector[k + 1];
                    }
                    longitud--;
                    j--;
                }
            }
        }
        
        int[] resultado = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            resultado[i] = vector[i];
        }
        return resultado;
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
