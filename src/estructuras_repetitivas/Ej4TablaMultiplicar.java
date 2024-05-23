package estructuras_repetitivas;

import java.util.Scanner;

public class Ej4TablaMultiplicar {

    /*Dado un numero entero positivo, mostrar la tabla de 
    multiplicar del mismo*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TABLAS DE MULTIPLICAR");
        int numero = 0;
        boolean esNumero = false;
        while (!esNumero) {
            System.out.println("Ingresa un numero entero: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    esNumero = true;
                } else {
                    System.out.println("Debe ingresar un numero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero positivo");
                sc.next();
            }
        }
        sc.close();
        System.out.println("\nLA TABLA DE " + numero);
        tablas(numero);
        sc.close();

    }

    public static void tablas(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (num * i));
        }
    }
}
