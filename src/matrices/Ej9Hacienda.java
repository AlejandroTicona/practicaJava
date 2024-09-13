package matrices;

import java.util.Random;

/*En una hacienda existen N vacas. 
Diseñe un algoritmo que guarde en una matriz de 
dimensión 7xN la producción de leche diaria 
(en litros) de cada una de las vacas, durante una semana. 
Además, el programa debe calcular la producción total de 
cada uno de los siete días, y el número de la vaca que 
dio más leche en cada día. */
public class Ej9Hacienda {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de vacas: ");
        int vacas = Validaciones.validacionEntero(0);
        int[][] produccionLeche = new int[7][vacas];
        produccionLeche = llenarLecheJajajaja(produccionLeche);
        System.out.println("PRODUCCION DE LECHE");
        mostrarProduccion(produccionLeche);
        produccionDiariaTotal(produccionLeche);
        mayorProductora(produccionLeche);
    }

    public static void mayorProductora(int[][] produccion) {
        int mayor = Integer.MIN_VALUE, pos = 0;
        int[] productoras = new int[produccion[0].length];
        for (int i = 0; i < produccion.length; i++) {
            for (int j = 0; j < produccion[0].length; j++) {
                productoras[j] += produccion[i][j];
            }
        }

        for (int i = 0; i < productoras.length; i++) {
            if (productoras[i] > mayor) {
                mayor = productoras[i];
                pos = i;
            }
        }

        System.out.println("La vaca que produce mas es la #" + pos + "\ncon " + mayor + " litros producidos");
    }

    public static void produccionDiariaTotal(int[][] produccion) {
        int[] produccionDiaria = new int[produccion.length];
        for (int i = 0; i < produccion.length; i++) {
            for (int j = 0; j < produccion[0].length; j++) {
                produccionDiaria[i] += produccion[i][j];
            }
        }
        for (int i = 0; i < produccion.length; i++) {
            System.out.println("Litros dia " + (i + 1) + ": " + produccionDiaria[i]);
        }
    }

    public static int[][] llenarLecheJajajaja(int[][] produccion) {
        Random random = new Random();
        for (int i = 0; i < produccion.length; i++) {
            for (int j = 0; j < produccion[0].length; j++) {
                //una vaca produce entre 20 a 50 litros de leche diarios
                produccion[i][j] = random.nextInt(50 - 20 + 1) + 20;
            }
        }
        return produccion;
    }

    public static void mostrarProduccion(int[][] produccion) {
        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < produccion.length; i++) {
            salida.append("Dia " + (i + 1) + ": [");
            for (int j = 0; j < produccion[0].length; j++) {
                salida.append(produccion[i][j]);
                if (j < produccion[0].length - 1) {
                    salida.append(" , ");
                }
            }
            salida.append("]\n");
        }
        System.out.println(salida);
    }
}
