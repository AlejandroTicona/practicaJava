package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosCuatroDigitos {

    /*
    Dados dos números de cuatro dígitos cada uno. 
    Generar un nuevo número intercalando 
    sus dígitos. En caso de que cualquiera de los números 
    no tenga cuatro dígitos mostrar 
    un mensaje que diga “NO CORRESPONDE”.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, compuesto;
        try {
            System.out.println("Ingresa el numero 1: ");
            n1 = sc.nextInt();
            System.out.println("Ingresa el numero 2: ");
            n2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar 2 numeros enteros");
            return;
        }

        if (n1 >= 1000 && n1 <= 9999 && n2 >= 1000 && n2 <= 9999) {
            compuesto = ((n1 / 1000) * 10000000) + ((n2 / 1000) * 1000000) + (((n1 % 1000) / 100) * 100000) + (((n2 % 1000) / 100) * 10000) + (((n1 % 100) / 10) * 1000) + (((n2 % 100) / 10) * 100) + (((n1 % 10) * 10)) + ((n2 % 10) * 1);
            System.out.println(compuesto);
        } else {
            System.out.println("No corresponde");
        }

        //se que es bastante extenso, vere la forma de actualizarlo en una futura version 2.0 de estos ejercicios cuando aprenda mas cosas y herramientas del lenguaje que pueda utilizar a favor de la optimizacion y rendimiento
    }
}
