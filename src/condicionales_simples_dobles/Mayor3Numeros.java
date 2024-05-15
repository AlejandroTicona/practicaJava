package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mayor3Numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0, n2 = 0, n3 = 0;
        try {
            System.out.println("Ingresa el numero 1: ");
            n1 = sc.nextFloat();
            System.out.println("Ingresa el numero 2: ");
            n2 = sc.nextFloat();
            System.out.println("Ingresa el numero 3: ");
            n3 = sc.nextFloat();

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar solo números.");
            return; // Salir del programa si hay un error
        }

        System.out.println("RESPUESTA 1 --------------");
        if (n1 == n2 && n2 == n3) {
            //equivalencia entre todos 
            System.out.println("Todos son iguales");
        } else {
            if (n1 > n2) {
                if (n1 > n3) {
                    System.out.println(n1 + " es el mayor de los 3 numeros");
                } else {
                    System.out.println(n3 + " es el mayor de los 3 numeros");
                }
            } else {
                if (n2 > n3) {
                    System.out.println(n2 + " es el mayor de los 3 numeros");
                } else {
                    System.out.println(n3 + " es el mayor de los 3 numeros");
                }
            }
        }
        System.out.println("FIN RESPUESTA 1---------\n\nRESPUESTA 2 -------------------");
        //al parecer esta respuesta es mas optima que la anterior, seguire investigando optimizaciones y esas cosas pero antes debo recordar como era esto XD
        if (n1 != n2 || n2 != n3 || n3 != n1) {
            if (n1 > n2 && n1 > n3) {
                System.out.println(n1 + " es el mayor");
            } else {
                if (n2 > n1 && n2 > n3) {
                    System.out.println(n2 + " es el mayor");
                } else {
                    System.out.println(n3 + " es el mayor");
                }
            }
        } else {
            System.out.println("Todos los numeros son iguales");
        }
        System.out.println("FIN RESPUESTA 2----------------");
    }
}
