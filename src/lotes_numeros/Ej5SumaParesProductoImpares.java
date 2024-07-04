package lotes_numeros;

import java.util.Scanner;

/*Pedir un lote de números 
hasta que ingrese un número negativo, 
de los cuales se debe 
mostrar la suma de los números pares y 
el producto de los impares*/
public class Ej5SumaParesProductoImpares {

    public static void main(String[] args) {
        int[] salida = sumProd();
        System.out.println("La suma de los pares es: " + salida[0] + "\nEl producto de los impares es: " + salida[1]);
    }

    public static int[] sumProd() {
        Scanner sc = new Scanner(System.in);
        int[] salida = new int[2];
        salida[0] = 0;
        salida[1] = 1;
        int n;
        boolean isNegative = false;
        while (!isNegative) {
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
            if (n <= 0) {
                isNegative = true;
            } else {
                if (n % 2 == 0) {
                    salida[0] = salida[0] + n;
                } else {
                    salida[1] = salida[1] * n;
                }
            }
        }
        return salida;
    }
}
