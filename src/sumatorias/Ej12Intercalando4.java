package sumatorias;

import java.util.Scanner;

/*S =4 - 8 + 12 - 16 + 20 - ….*/
public class Ej12Intercalando4 {

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
                    System.out.println("Ingrese un numero mayor a 0");
                }
            } else {
                System.out.println("Ingresa un numero entero");
                sc.next();
            }
        }
        System.out.println(intercalando4(numero));
    }

    private static int intercalando4(int numero) {
        StringBuilder salida = new StringBuilder();
        int suma = 0, n = 4;
        for (int i = 1; i <= numero; i++) {
            salida.append(n);
            if (i % 2 == 1) {
                suma += n;
                n += 4;
                if (i < numero) {
                    salida.append(" - ");

                }
            } else {
                suma -= n;
                n += 4;
                if (i < numero) {
                    salida.append(" + ");

                }
            }
        }
        System.out.println(salida.toString());

        return suma;
    }
}
