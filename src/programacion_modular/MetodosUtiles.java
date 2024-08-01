package programacion_modular;

import java.util.Scanner;

public class MetodosUtiles {

    
    public static void main(String[] args) {
        System.out.println(validacionEntero());
    }

    public static int validacionEntero() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean isInteger = false;
        while (!isInteger) {
            System.out.println("Ingrese un numero entero: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                isInteger = true;
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        return n;
    }

    public static float validacionFlotante() {
        Scanner sc = new Scanner(System.in);
        float n = 0;
        boolean isFloat = false;
        while (!isFloat) {
            System.out.println("Ingrese un numero: ");
            if (sc.hasNextFloat()) {
                n = sc.nextFloat();
                isFloat = true;
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        return n;
    }

    public static int validacionNumeroParametro(int num) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean isInteger = false;
        while (!isInteger) {
            System.out.println("Ingrese una opcion entre 1 y " + num + ": ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0 && n <= num) {
                    isInteger = true;
                }
            } else {
                System.out.println("Debe ingresar una opcion valida");
                sc.next();
            }
        }
        return n;
    }
}
