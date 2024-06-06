package series;

import java.util.Scanner;

/*1, 3, 1, 5, 1, 7,...*/
public class Ej6Impares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean myNumber = false;
        while (!myNumber) {
            System.out.println("Ingresa un numero: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    myNumber = true;
                } else {
                    System.out.println("Debes ingresar un numero positivo");
                }
            } else {
                System.out.println("Debes ingresar un numero: ");
                sc.next();
            }
        }
        impares(numero);
    }

    public static void impares(int num) {
        StringBuilder salida = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                salida.append("1");
            } else {
                salida.append(i + 1);
            }
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
