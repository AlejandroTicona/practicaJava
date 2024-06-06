package series;

import java.util.Scanner;

/*0, 1, 2, 4, 3, 5, 6, 8, 10, 7, 9, 11, . ..*/
public class Ej14ParesImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingresa un numero entero positivo: ");
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
        serieParImpar(numero);
    }

    public static void serieParImpar(int num) {
        StringBuilder salida = new StringBuilder();
        int cs = 1, cpar = 0, cimpar = 1, m = cpar, s = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(m);
            if (m % 2 == 0) {
                if (cs == s) {
                    m = cimpar;
                    cs = 1;
                    cpar = cpar + 2;
                } else {
                    cs++;
                    cpar = cpar + 2;
                    m = cpar;
                }
            } else {
                if (cs == s) {
                    m = cpar;
                    cs = 1;
                    cimpar = cimpar + 2;
                    s++;
                } else {
                    cs++;
                    cimpar = cimpar + 2;
                    m = cimpar;
                }
            }

            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
