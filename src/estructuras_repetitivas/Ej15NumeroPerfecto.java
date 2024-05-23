package estructuras_repetitivas;

import java.util.Scanner;

/*Dado un número entero positivo n, 
verificar si este número es Perfecto 
(es perfecto si la suma de sus divisores 
exceptuando al mismo número es igual al mismo número).*/
public class Ej15NumeroPerfecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero positivo: ");
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
        if (esPerfecto(numero)) {
            System.out.println("Es un numero perfecto");
        } else {
            System.out.println("No es un numero perfecto");
        }
    }

    public static boolean esPerfecto(int num) {
        int suma = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        return suma == num;
    }

}
