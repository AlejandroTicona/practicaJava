package sumatorias;

import java.util.Scanner;

/*s = 1/2 + 2/3 + 3/4 + 4/5...*/
public class Ej6SumatoriaFracciones {

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
        System.out.println("La sumatoria es : " + sumatoriaFracciones(numero));

    }

    private static float sumatoriaFracciones(int num) {
        StringBuilder salida = new StringBuilder();
        float suma = 0, denominador = 1, numerador = 2;
        for (int i = 1; i <= num; i++) {
            salida.append((int) denominador).append("/").append((int) numerador);
            suma = (float) suma + (denominador / numerador);
            denominador++;
            numerador++;
            if (i < num) {
                salida.append(" + ");
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
