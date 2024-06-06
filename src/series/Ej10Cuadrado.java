package series;

import java.util.Scanner;

/* 0, 1, 4, 9, 16,... */
public class Ej10Cuadrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingresa un numero entero mayor a 0: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        serieCuadrada(numero);
    }

    public static void serieCuadrada(int num) {
        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < num; i++) {
            salida.append((int) Math.pow(i, 2));
            if (i < num - 1) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }

}
