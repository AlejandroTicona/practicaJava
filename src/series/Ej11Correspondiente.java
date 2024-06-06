package series;

import java.util.Scanner;

/*1, 2, 2, 3, 3, 3, 4, 4,...*/
public class Ej11Correspondiente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero mayor a 0: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero entero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero positivo");
                sc.next();
            }
        }
        serieCorrespondiente(numero);
    }

    public static void serieCorrespondiente(int num) {
        StringBuilder salida = new StringBuilder();
        int c = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (c == num) {
                    break;
                }
                salida.append(i);
                if (c < num-1) {
                    salida.append(" , ");
                }
                c++;
            }
        }
        System.out.println(salida.toString());
    }
}
