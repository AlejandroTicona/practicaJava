package lotes_numeros;

import java.util.Scanner;

/*Encontrar el menor y el mayor de n números*/
public class Ej14MayorYMenor {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        int salida[] = mayorMenor(numero);
        System.out.println("El mayor es: " + salida[1] + "\nEl menor es: " + salida[0]);
    }

    public static int[] mayorMenor(int num) {
        Scanner sc = new Scanner(System.in);
        int[] salida = new int[2];
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, n;
        System.out.println("Ingresa los " + num + " numeros del lote: ");
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            if (n < menor) {
                menor = n;
            }
            if (n > mayor) {
                mayor = n;
            }
        }
        salida[0] = menor;
        salida[1] = mayor;
        return salida;
    }
}
