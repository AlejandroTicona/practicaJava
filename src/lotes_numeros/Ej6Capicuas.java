package lotes_numeros;

import java.util.Scanner;

/*Leer un lote de números mayores a 100, 
determinar cuántos números capicúas contiene 
el lote. */
public class Ej6Capicuas {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        System.out.println("La cantidad de numeros capicuas son: " + capicuas(numero));
    }

    public static int capicuas(int num) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, n;
        for (int i = 1; i <= num; i++) {
            while (true) {
                System.out.println("Ingrese un numero entero mayor a 100: ");
                n = sc.nextInt();
                if (n < 100) {
                    System.out.println("Debe ingresar un numero mayor a 100");
                } else {
                    break;
                }
            }

            if (isCapicua(n)) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean isCapicua(int num) {
        boolean isCapicua;
        int nn = 0, aux = num;
        while (num > 0) {
            nn = (nn * 10) + (num % 10);
            num /= 10;
        }
        isCapicua = nn == aux;
        return isCapicua;
    }
}
