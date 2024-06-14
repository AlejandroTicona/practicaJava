package sumatorias;

import java.util.Scanner;

public class Ej11DenominadoresFactoriales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Introduce un numero entero mayor a 0: ");
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
        System.out.println(sumatoriaDenominadorFactorial(numero));

    }

    private static float sumatoriaDenominadorFactorial(int numero) {
        StringBuilder salida = new StringBuilder();
        int n = 3, d = 1, fact, sw = 0;
        float ope = 0, suma = 0;
        for (int i = 1; i <= numero; i++) {
            salida.append("(" + n + "/" + "!" + d + ")");
            fact = 1;
            for (int j = 1; j <= d; j++) {
                fact = fact * j;
            }
            ope = ((float) n / fact);
            if (sw == 0) {
                suma = (float) suma + ope;
                sw = 1;
                n += 3;
                d++;
                if (i < numero) {
                    salida.append(" - ");
                }
            } else {
                suma = (float) suma - ope;
                sw = 0;
                n += 3;
                d++;
                if (i < numero) {
                    salida.append(" + ");
                }
            }
        }
        System.out.println(salida.toString());
        return (float) suma;
    }
}
