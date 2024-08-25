package vectores;

import java.util.Scanner;

/*Leer N pares de números X y Z, el mayor de X y Z 
almacenar como elemento de un vector A y si es menor 
o igual como elemento del vector B. Desplegar los vectores. */
public class Ej16Pares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de pares n: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese el par de números X y Z (separados por espacio): ");
            int x = scanner.nextInt();
            int z = scanner.nextInt();

            if (x > z) {
                a[aIndex] = x;
                aIndex++;
            } else {
                b[bIndex] = x;
                bIndex++;
            }
        }

        // Desplegar el arreglo A
        System.out.print("Vector A (mayores): ");
        for (int i = 0; i < aIndex; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Desplegar el arreglo B
        System.out.print("Vector B (menores o iguales): ");
        for (int i = 0; i < bIndex; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

    }

}
