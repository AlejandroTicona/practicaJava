package vectores;

import java.util.Random;

/*
Se pide hacer un programa que permita trabajar con vectores y 
funciones al mismo tiempo. En el programa tendremos un vector
que puede tener una determinada longitud máxima 
(definida a través de una constante). En un momento determinado 
podremos conocer el número de componentes útiles del vector 
mediante una variable entera útil vector. 
El programa debe presentar un menú con las siguientes opciones: 
a. Imprimir el vector actual 
b. Generar aleatoriamente los elementos de un vector 
c. Ordenación del vector en forma ascendente 
d. Ordenación del vector en forma descendente 
e. Salir del programa
 */
public class Ej14VectorMultiFuncion {

    public static final int dimension_vector = 15;

    public static void main(String[] args) {
        boolean end = false;
        int[] vector = new int[dimension_vector];
        while (!end) {
            System.out.println("Ingresa una opcion: ");
            System.out.println("1. IMPRIMIR VECTOR ACTUAL: ");
            System.out.println("2. GENERAR VALORES ALEATORIOS");
            System.out.println("3. ORDENAR ASCENDENTE");
            System.out.println("4. ORDENAR DESCENDENTE");
            System.out.println("5. SALIR DEL PROGRAMA");
            int opc = Validaciones.validacionEntero(0);
            switch (opc) {
                case 1:
                    System.out.println("MOSTRANDO EL VECTOR");
                    mostrarVector(vector);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("LLENANDO EL VECTOR");
                    llenarVector(vector);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("ORDENANDO ASCENDENTE");
                    ordenarAscendente(vector);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("ORDENANDO DESCENDENTE");
                    ordenarDescendente(vector);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("TERMINANDO PROGRAMA...");
                    end = true;
                    break;
                default:
                    System.out.println("OPCION INVALIDA...");
            }
        }
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
        System.out.print(salida);
    }

    public static int[] llenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
        return vector;
    }

    public static int[] ordenarAscendente(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i -1; j++) {
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        return vector;
    }

    public static int[] ordenarDescendente(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i -1; j++) {
                if (vector[j] < vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        return vector;
    }
}
