package series;

import java.util.Scanner;

/*-1, 0, 3, 8, 15, 24,*/
public class Ej12SerieRara {

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
                    System.out.println("Debe ingresar un numero positivo");
                }
            } else {
                sc.next();
                System.out.println("Debe ingresar un numero entero");
            }
        }
        imparAscendente(numero);
    }

    public static void imparAscendente(int num) {
        StringBuilder salida = new StringBuilder();
        int s = -1, impar = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(s);
            s = s + impar;
            impar = impar + 2;
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
