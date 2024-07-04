package lotes_numeros;
//creacion de los metodos utiles como ser
//validacionNumero

import java.util.Scanner;

public class MetodosUtiles {

    public static int validacionNumero() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese la cantidad de numeros a ingresar, debe ser mayor a 0: ");
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

        return numero;
    }
    
    public static int validacionNumero3() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese la cantidad de numeros a ingresar, debe ser mayor a 3: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero >= 3) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero mayor a 3");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }

        return numero;
    }
    
    public static int validacionNumero999() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese la cantidad de numeros a ingresar, debe ser mayor a 0: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0 || numero == -999) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }

        return numero;
    }
}
