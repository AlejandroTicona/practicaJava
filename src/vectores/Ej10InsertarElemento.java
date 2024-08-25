package vectores;

import java.util.Random;

/* Dado un vector A de n elementos , se pide insertar en el vector A un elemento X en la 
posición P, en caso de que no exista esa posición, colocar X como último elemento del 
vector. */
public class Ej10InsertarElemento {

    //requerir el levantamiento de necesidades de los
    //requerimientos de para lo cual 1 persona hara de interesado
    //cliente y las otras 2 haran recoleccion de la informacion
    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector: ");
        int n = Validaciones.validacionEntero(0);
        int[] vector = new int[n];
        vector = llenarVector(vector);
        System.out.println(mostrarVector(vector));
        System.out.println("INGRESE EL ELEMENTO A INGRESAR: ");
        int elemento = Validaciones.validacionEntero(0);
        System.out.println("INGRESE LA POSICION EN LA QUE " + elemento + " SERA INGRESADO");
        int posicion = Validaciones.validacionEntero(0);
        int[] salida = insertar(vector, elemento, posicion);
        System.out.println(mostrarVector(salida));
    }

    public static int[] insertar(int[] vector, int elemento, int posicion) {
        int[] salida = new int[vector.length + 1];

        if (posicion >= vector.length) {
            for (int i = 0; i < vector.length; i++) {
                salida[i] = vector[i];
            }
            salida[vector.length] = elemento;
        } else {
            int j = 0;
            for (int i = 0; i < salida.length; i++) {
                if (i == posicion-1) {
                    salida[i] = elemento;
                } else {
                    salida[i] = vector[j];
                    j++;
                }
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
}
