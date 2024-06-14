package sumatorias;

import java.util.Scanner;

/*S = 3 - 6 + 9 - 12 + 15 - …*/
public class Ej7PositivoAlternadoMultiplo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero mayor a 0: ");
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
        System.out.println(alternando3(numero));
    }

    private static int alternando3(int num) {
        StringBuilder salida = new StringBuilder();
        int m = 0, n = 0;
        for (int i = 1; i <= num; i++) {
            m += 3;
            if (i % 2 == 1) {
                n = n + m;
            } else {
                n = n - m;
            }
            salida.append(m);
            if (i < num && i % 2 == 1) {
                salida.append(" - ");
            }
            if (i < num && i % 2 == 0) {
                salida.append(" + ");
            }
        }
        System.out.println(salida.toString());
        return n;
    }
}
