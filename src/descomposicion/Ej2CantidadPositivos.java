package descomposicion;

import java.util.Scanner;

/*Dado un numero n entero positivo, mostrar la cantidad de dígitos que este contiene*/
public class Ej2CantidadPositivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero mayora 0: ");
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
        System.out.println(cantidadDigitos(numero));
    }

    private static int cantidadDigitos(int numero) {
        int c = 0;
        while (numero > 0) {
            numero /= 10;
            c++;
        }
        return c;
    }
}
