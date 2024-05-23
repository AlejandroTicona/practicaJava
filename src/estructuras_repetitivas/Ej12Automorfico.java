package estructuras_repetitivas;

import java.util.Scanner;

/*
    . Dado un numero N entero positivo. 
    Determinar si el mismo es un numero automórfico. 
    Es automórfico si los últimos dígitos de su cuadrado 
    son los dígitos de N.
 */
public class Ej12Automorfico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingresa un numero entero positivo: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero entero positivo");
                }
            } else {
                System.out.println("Debe ingrear numeros enteros");
                sc.next();
            }
        }
        if (numerosAutomorficos(numero)) {
            System.out.println("El numero es automorfico");
        } else {
            System.out.println("El numero no es automorfico");
        }

    }

    public static boolean numerosAutomorficos(int num) {
        int potencia = (int) Math.pow(num, 2);
        int j = (int) (potencia % (Math.pow(10, cantidadDigitos(num))));
        if (j == num && j>0) {
            return true;
        } else {
            return false;
        }

    }

    public static int cantidadDigitos(int num) {
        int c = 0;
        if (num == 0) {
            c = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                c++;
            }
        }
        return c;
    }
}
