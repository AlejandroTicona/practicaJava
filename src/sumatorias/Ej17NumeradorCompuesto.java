package sumatorias;

import java.util.Scanner;

public class Ej17NumeradorCompuesto {

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
                    System.out.println("Debe ingresar un numero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println(numeradorCompuesto(numero));

    }

    private static float numeradorCompuesto(int numero) {
        StringBuilder salida = new StringBuilder();
        float suma = 0, ope = 0, c = 1;
        int d = 3, fact;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 1) {
                fact = 1;
                for (int j = 1; j <= d; j++) {
                    fact *= j;
                }
                salida.append("(" +(int) c +"*"+ (int)(c + 1) + "/" + d + "!" + ")");
                ope = (float) (c * (c + 1) / fact);
                d += 4;
                c += 2;
                if (i < numero) {
                    salida.append(" - ");
                }
                suma += (float) ope;
            } else {
                salida.append("(" + (int)c +"*"+ (int)(c + 1) + "/" + d + ")");
                ope = (float) ((c * (c + 1)) / d);
                d += 4;
                c += 2;
                salida.append(" + ");
                suma -= (float)ope;
            }
        }
        System.out.println(salida.toString());
        return suma;
    }

}
