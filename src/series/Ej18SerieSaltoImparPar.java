package series;

import java.util.Scanner;

/*1, 0, 3, 2, 5, 4, 7, 6, …. */
public class Ej18SerieSaltoImparPar {

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
                    System.out.println("Ingrese un numero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        serieParImpar(numero);
    }

    public static void serieParImpar(int num) {
        StringBuilder salida = new StringBuilder();
        int impar = 1, par = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                salida.append(impar);
                impar += 2;
            } else {
                salida.append(par);
                par += 2;
            }
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
