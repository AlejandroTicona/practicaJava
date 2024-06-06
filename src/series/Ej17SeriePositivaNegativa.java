package series;

import java.util.Scanner;

/*-1, 0, -2, 1, -3, 2, -4, 3*/
public class Ej17SeriePositivaNegativa {

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
                    System.out.println("Debe ingresar un numero positivos");
                }
            } else {
                System.out.println("Ingrese un numero entero");
                sc.next();
            }
        }

        seriePositivaNegativa(numero);
    }

    public static void seriePositivaNegativa(int num) {
        StringBuilder salida = new StringBuilder();
        int negativo = -1, positivo = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                salida.append(negativo);
                negativo--;
            } else {
                salida.append(positivo);
                positivo++;
            }
            if (i < num) {
                salida.append(" , ");
            }
        }

        System.out.println(salida.toString());
    }
}
