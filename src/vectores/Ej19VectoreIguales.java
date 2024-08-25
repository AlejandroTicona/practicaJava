package vectores;

import java.util.Scanner;

/*Se tienen almacenados en la memoria dos vectores A y B de 
N elementos cada uno. Hacer un algoritmo que escriba la 
palabra “Iguales” si ambos vectores son iguales y“Diferentes” 
si no lo son. Serán iguales cuando en la misma posición de ambos 
vectores se tenga el mismo valor para todos los elementos. */
public class Ej19VectoreIguales {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension de los vectores: ");
        int n = Validaciones.validacionEntero(0);
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        System.out.println("VECTOR A");
        vectorA = llenarVector(vectorA);
        System.out.println("VECTOR B");
        vectorB = llenarVector(vectorB);
        if (compararVectores(vectorB, vectorA)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }

    }

    public static int[] llenarVector(int[] vector) {
        System.out.println("Ingrese los " + vector.length + " digitos del vector");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Validaciones.validacionEntero(0);
        }
        return vector;
    }

    public static boolean compararVectores(int[] vector1, int[] vector2) {
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }
}
