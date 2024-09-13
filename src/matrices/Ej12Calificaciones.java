package matrices;

import java.util.Random;

/*En una matriz C de M x 6 se encuentran almacenadas las calificaciones de 6 materias 
de un grupo de M estudiantes. Elaborar un diagrama de flujo que nos permita calcular 
e imprimir lo siguiente: 
a) La nota promedio de cada estudiante 
b) El número de estudiantes que aprobaron cada materia 
c) El número de estudiantes que reprobaron cada materia 
d) La nota promedio de cada materia*/
public class Ej12Calificaciones {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int m = Validaciones.validacionEntero(0);
        int[][] calificaciones = new int[m][6];
        calificaciones = llenarMatriz(calificaciones);
        System.out.println("LAS CALIFICACIONES SON: ");
        mostrarMatriz(calificaciones);
        int[] promedios = promedios(calificaciones);
        System.out.println("LOS PROMEDIOS SON");
        mostrarPromedios(promedios);
        System.out.println("MATERIAS APROBADAS");
        mostrarMateriasAprobadas(cantidadAprobados(calificaciones));
        System.out.println("MATERIAS REPROBADAS");
        mostrarMateriasReprobadas(cantidadReprobadas(calificaciones));
        System.out.println("PROMEDIOS DE MATERIAS");
        mostrarPromediosMateria(promediosMateria(calificaciones));
        
    }

    public static int[] promediosMateria(int[][] notas) {
        int[] c = new int[notas[0].length];
        for (int materia = 0; materia < notas[0].length; materia++) {
            int suma = 0;
            for (int estudiante = 0; estudiante < notas.length; estudiante++) {
                suma += notas[estudiante][materia];
            }
            c[materia] = suma / notas.length;
        }
        return c;
    }
    
    public static int[] cantidadAprobados(int[][] notas) {
        int[] c = new int[notas[0].length];
        for (int materia = 0; materia < notas[0].length; materia++) {
            for (int estudiante = 0; estudiante < notas.length; estudiante++) {
                if (notas[estudiante][materia] >= 51) {
                    c[materia]++;
                }
            }
        }
        return c;
    }

    public static int[] cantidadReprobadas(int[][] notas) {
        int[] c = new int[notas[0].length];
        for (int materia = 0; materia < notas[0].length; materia++) {
            for (int estudiante = 0; estudiante < notas.length; estudiante++) {
                if (notas[estudiante][materia] < 51) {
                    c[materia]++;
                }
            }
        }
        return c;

    }
    
    public static int[] promedios(int[][] matriz) {
        int[] promedios = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                promedios[i] += matriz[i][j];
                if (j == matriz[0].length - 1) {
                    promedios[i] /= 6;
                }
            }
        }
        return promedios;
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            salida.append("Estudiante " + (i + 1) + " [");
            for (int j = 0; j < matriz[0].length; j++) {
                salida.append(matriz[i][j]);
                if (j < matriz[0].length - 1) {
                    salida.append(" , ");
                }
            }
            salida.append("]\n");
        }
        System.out.println(salida);
    }

    public static void mostrarPromedios(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El estudiante " + (i + 1) + " tiene un promedio de " + vector[i]);
        }
    }
    
    public static void mostrarMateriasAprobadas(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("La materia "+(i+1)+" fue aprobada "+vector[i]+" veces");
        }
    }
    
    public static void mostrarMateriasReprobadas(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("La materia "+(i+1)+" fue reprobada "+vector[i]+" veces");
        }
    }

    public static void mostrarPromediosMateria(int[] promedios){
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("El promedio de la materia "+(i+1)+" es de "+promedios[i]);
        }
    }
    
}
