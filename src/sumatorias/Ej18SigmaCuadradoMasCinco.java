package sumatorias;

import java.util.Scanner;

public class Ej18SigmaCuadradoMasCinco {

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
        System.out.println(sigmaIElevadoCuadradoMasCinco(numero));

    }

    private static int sigmaIElevadoCuadradoMasCinco(int numero) {
        StringBuilder salida = new StringBuilder();
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            salida.append("( " + i + " ^ 2 "+ " + 5 )");
            suma += (Math.pow(i, 2) + 5);
            if (i < numero) {
                salida.append(" + ");
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
