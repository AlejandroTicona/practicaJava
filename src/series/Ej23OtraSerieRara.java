package series;

import java.util.Scanner;

/*1, 3, 7, 13, 21, 31, 43, …*/
public class Ej23OtraSerieRara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero positivo: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        otraSerieRara(numero);
    }

    public static void otraSerieRara(int num) {
        StringBuilder salida = new StringBuilder();
        int c = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(c);
            c = c + (i * 2);
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());

    }
}
