package sumatorias;

import java.util.Scanner;

public class Ej19SigmaFraccion {

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
                    System.out.println("Debe ingresar un numero mayor a 0: ");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println(sigmaFraccion(numero));
    }

    private static float sigmaFraccion(int numero) {
        StringBuilder salida = new StringBuilder();
        float suma = 0;

        for (int y = 1; y <= numero; y++) {
            for (int x = 1; x <= numero; x++) {
                salida.append("(" + y + "/" + x + ") + ");
                suma += (float) y / x;
            }
        }

        if (salida.length() > 3) {
            salida.setLength(salida.length() - 3);
        }

        System.out.println(salida.toString());
        System.out.println("El resultado es: " + suma);

        return suma;
    }
}