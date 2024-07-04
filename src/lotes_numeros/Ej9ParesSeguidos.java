package lotes_numeros;

import java.util.Scanner;

/*Leer un lote de N números hasta que 
ingrese un numero negativo, determinar cuántas 
números pares seguidos hay en el lote. */
public class Ej9ParesSeguidos {

    public static void main(String[] args) {
        System.out.println("En el lote de numeros hay "+paresSeguidos()+" pares seguidos");
    }

    public static int paresSeguidos() {
        Scanner sc = new Scanner(System.in);
        int n = 0, c = 0;
        boolean isNegative = false, sw = false;
        System.out.println("Ingresa el lote de numeros: ");
        while (!isNegative) {
            n = sc.nextInt();
            if (n < 0) {
                isNegative = true;
            }
            if (sw == true && n % 2 == 0) {
                c++;
            }
            if (n % 2 == 1) {
                sw = false;
            } else {
                sw = true;
            }
        }
        return c;
    }
}
