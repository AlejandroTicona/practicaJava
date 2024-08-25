package vectores;

import java.util.Random;

/*Si se tiene un vector A con n elementos. hallar la cantidad de elementos que son 
divisibles entre 5.
 */
public class Ej1Divisibles5 {

    public static void main(String[] args) {
        int[] vector;
        System.out.println("Ingrese la dimension del vector: ");
        int dimension = Validaciones.validacionEntero(0);
        vector = new int[dimension];
        System.out.println("EL VECTOR INICIAL ES: ");
        vector = llenandoVector(vector);
        mostrandoVector(vector);
        System.out.println("LOS DIVISIBLES ENTRE 5 SON");
        mostrandoDivisibles5(vector);
    }

    public static void mostrandoDivisibles5(int num[]) {
        int pos = 0;
        int[] salida = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 5 == 0 && num[i] != 0) {
                System.out.print(num[i]);
                if (i < num.length - 1) {
                    System.out.print(" , ");
                }
            }
        }
        System.out.println("");
    }

    public static int[] llenandoVector(int[] num) {
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }
        return num;
    }

    public static void mostrandoVector(int[] num) {
        System.out.println("");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println("");
    }
}
