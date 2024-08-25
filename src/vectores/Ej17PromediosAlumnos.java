package vectores;

import java.util.Scanner;

/* Se tienen los nombres de los N alumnos de una escuela, 
además de su promedio general. Realice un algoritmo para 
capturar esta información, la cual se debe almacenar en 
arreglos, un vector para el nombre y otro para el promedio, 
después de capturar la información se debe ordenar con base 
en su promedio, de mayor a menor, los nombres deben 
corresponder con los promedios. */
public class Ej17PromediosAlumnos {

    public static void main(String[] args) {
        System.out.println("PROMEDIOS DE ESTUDIANTES: ");
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int n = Validaciones.validacionEntero(0);
        String[] nombres = new String[n];
        int[] notas = new int[n];
        nombres = llenandoNombres(nombres);
        notas = llenandoNotas(nombres, notas);
        System.out.println("LAS NOTAS SON: ");
        mostrarNotas(nombres, notas);
        System.out.println("ORDENANDO DESCENDENTEMENTE");
        for (int i = 0; i < nombres.length-1; i++) {
            for (int j = 0; j < nombres.length-1; j++) {
                if(notas[j] < notas[j+1] ){
                    int aux = notas[j];
                    notas[j] = notas[j+1];
                    notas[j+1] = aux;
                    String resp = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = resp;
                }
            }
        }
        System.out.println("LA LISTA ORDENADA ES: ");
        mostrarNotas(nombres, notas);
    }

    
    public static String[] llenandoNombres(String[] lista) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingrese el nombre " + (i+1) + ":");
            lista[i] = sc.nextLine();
        }
        return lista;
    }

    public static int[] llenandoNotas(String[] nombres, int[] notas) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese el promedio general de " + nombres[i]);
            notas[i] = sc.nextInt();
        }
        return notas;
    }
    
    public static void mostrarNotas(String[] nombres, int[] notas){
        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < notas.length; i++) {
            salida.append("["+nombres[i]+" tiene un promedio de "+notas[i]+"]\n");
        }
        System.out.println(salida);
    }
}
