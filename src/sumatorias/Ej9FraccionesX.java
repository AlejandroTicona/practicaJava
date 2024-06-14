package sumatorias;

import java.util.Scanner;

public class Ej9FraccionesX {

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
                    System.out.println("Debe ingresar un numero mayor a 0: ");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        int x = 0;
        while (isNumber) {
            System.out.println("Ingrese x: ");
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                if (x > 0) {
                    isNumber = false;
                } else {
                    System.out.println("X debe ser positivo");
                }
            } else {
                System.out.println("X debe ser un numero entero");
                sc.next();
            }
        }
        System.out.println(fraccionesConX(numero, x));

    }

    private static float fraccionesConX(int num, int x) {
        StringBuilder salida = new StringBuilder();
        int n = 1, s = 1, d = 1, cs = 1, exp = 1;
        float suma = 0, ope = 0;
        for (int i = 1; i <= num; i++) {
            salida.append("(" + n + "*" + x + "^" + exp + " / " + d + ")");
            ope = (float) ((n * (Math.pow(x, exp))) / d);
            if (cs != 2) {
                cs++;
                exp++;
                d = exp * n;
                suma = suma + ope;
                if (i < num) {
                    salida.append(" - ");
                }
            } else {
                cs = 1;
                exp++;
                n++;
                d = exp * n;
                suma = suma - ope;
                if (i < num) {
                    salida.append(" + ");
                }
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
