package sumatorias;

import java.util.Scanner;

public class EjOtroFactorialEsteNoTeniaNumero {

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
            }
        }
        System.out.println(otroFactorial(numero));
    }

    private static float otroFactorial(int numero) {
        StringBuilder salida = new StringBuilder();
        int num = 1;
        float ope = 0, suma = 0, fact = 1;
        for (int i = 1; i <= numero; i++) {
            salida.append(num + "/" + i + "!");
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            ope = (float) num / fact;
            num += 2;
            if (i % 2 == 1) {
                suma += ope;
                if (i < numero) {
                    salida.append(" - ");
                }
            } else {
                suma -= ope;
                if (i < numero) {
                    salida.append(" + ");
                }
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
