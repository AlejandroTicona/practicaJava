package estructuras_repetitivas;

import java.util.Scanner;

/*Introducir dos números enteros positivos n y k, 
    luego hallar el numero múltiplo de K respecto a n*/
public class Ej19MenorMultiplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, k = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingresa un numero entero mayor a 0: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                System.out.println("Ingresa otro numero entero mayor a 0: ");
                if (sc.hasNextInt()) {
                    k = sc.nextInt();
                    if (n > 0 && k > 0) {
                        isNumber = true;
                    } else {
                        System.out.println("Ingrese numeros positivos");
                    }
                } else {
                    System.out.println("Debe ingresar un numero entero");
                    sc.next();
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }

        menorMultiplo(n, k);
    }

    public static void menorMultiplo(int num1, int num2) {
        int multiplo = num2;
        while (multiplo <= num1) {
            multiplo = multiplo + num2;

        }
        if (multiplo == num1) {
            System.out.println("El multiplo de " + num2 + " mas cercano a : " + num1 + " es " + multiplo);
        } else {
            multiplo = multiplo - num2;
            System.out.println("El multiplo de " + num2 + " mas cercano a : " + num1 + " es " + multiplo);
        }
    }
}
