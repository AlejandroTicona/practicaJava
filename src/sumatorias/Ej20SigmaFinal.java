package sumatorias;

import java.util.Scanner;

public class Ej20SigmaFinal {

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
        System.out.println(ultimaSumatoria(numero));
    }

    private static float ultimaSumatoria(int numero) {
        StringBuilder salida = new StringBuilder();
        float suma = 0.f, fact = 1.f, den = 0.f;
        for (int i = 1; i <= numero; i++) {
            den = (2 * i + i);
            fact = 1;
            salida.append("(" + 2 + "*" + i + "/" + "(" + "2" + "*" + i + "+" + i + ")!" + ")");
            for (int j = 1; j <= den; j++) {
                fact = fact * j;
            }
            suma += (2.0 * i) / fact;
            if (i < numero) {
                salida.append(" + ");
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
