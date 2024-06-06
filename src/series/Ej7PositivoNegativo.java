package series;

import java.util.Scanner;

/*1, -1, 2, -2, 3, -3,... */
public class Ej7PositivoNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingresa un numero entero: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero positivo");
                }
            } else {
                System.out.println("Debes ingresar un numero entero: ");
                sc.next();
            }
        }

        positivoNegativo(numero);
    }

    public static void positivoNegativo(int num) {
        StringBuilder salida = new StringBuilder();
        int positivo = 1, negativo = -1;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                salida.append(positivo);
                positivo++;
            } else {
                salida.append(negativo);
                negativo--;
            }

            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
