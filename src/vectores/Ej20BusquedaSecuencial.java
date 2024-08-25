package vectores;

import java.util.Random;

/*Lea un número cualquiera y lo busque en el vector V, 
el cual tiene almacenados N elementos. 
Escribir la posición donde se encuentra almacenado el número 
en el vector o el mensaje “NO” si no lo encuentra. 
Búsqueda secuencial. */
public class Ej20BusquedaSecuencial {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector");
        int dimension = Validaciones.validacionEntero(0);
        int[] vector = new int[dimension];
        vector = llenarVector(vector);
        System.out.println("VECTOR RELLENADO");
        mostrarVector(vector);
        System.out.println("Digite el elemento a buscar: ");
        int n = Validaciones.validacionEntero(0);
        buscarElemento(vector, n);
    }

    public static void buscarElemento(int[]vector, int elemento){
        boolean encontrado = false;
        int i = 0, pos = 0;
        while (i < vector.length && encontrado == false) {            
            if(vector[i] == elemento){
                encontrado = true;
                pos = i+1;
            }
            i++;
        }
        if(encontrado){
            System.out.println("El elemento buscado "+vector[(pos-1)]+" esta la posicion "+pos);
        }else{
            System.out.println("NO");
        }
    }
    public static int[] llenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(20);
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
