package sumatorias;

import java.util.Scanner;

public class Ej16DenPotDe2 {

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
                    System.out.println("Debe ingresar un numero entero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }

        System.out.println(denPotDe2(numero));
    }

    private static float denPotDe2(int numero) {
        StringBuilder salida = new StringBuilder();
        float suma = 0, ope, den = 2, exp = 0;
        for (int i = 1; i <= numero; i++) {
            salida.append("(1/" + (int)den + "^" +(int) exp + ")");
            ope = (float) (1 / Math.pow(den, exp));
            suma += (float) ope;
            den++;
            exp += 2;
            if (i < numero) {
                salida.append(" + ");
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
