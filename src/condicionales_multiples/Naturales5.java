package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Naturales5 {

    /*De un conjunto de 5 números naturales: 
    • ¿Cuántos son menores que 15? 
    • ¿Cuántos son mayores de 50? 
    • ¿Cuántos están comprendidos entre 25 y 50.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        try {
            System.out.println("Ingresa el valor del numero 1: ");
            n1 = sc.nextInt();
            System.out.println("Ingresa el valor del numero 2: ");
            n2 = sc.nextInt();
            System.out.println("Ingresa el valor del numero 3: ");
            n3 = sc.nextInt();
            System.out.println("Ingresa el valor del numero 4: ");
            n4 = sc.nextInt();
            System.out.println("Ingresa el valor del numero 5: ");
            n5 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar numeros enteros: ");
            return;
        }
        int menores15 = 0, mayores50 = 0, entre25y50 = 0;
        switch (clasificarNumero(n1)) {
            case 1:
                menores15++;
                break;
            case 2:
                mayores50++;
                break;
            case 3:
                entre25y50++;
                break;
        }
        switch (clasificarNumero(n2)) {
            case 1:
                menores15++;
                break;
            case 2:
                mayores50++;
                break;
            case 3:
                entre25y50++;
                break;
        }
        switch (clasificarNumero(n3)) {
            case 1:
                menores15++;
                break;
            case 2:
                mayores50++;
                break;
            case 3:
                entre25y50++;
                break;
        }
        switch (clasificarNumero(n4)) {
            case 1:
                menores15++;
                break;
            case 2:
                mayores50++;
                break;
            case 3:
                entre25y50++;
                break;
        }
        switch (clasificarNumero(n5)) {
            case 1:
                menores15++;
                break;
            case 2:
                mayores50++;
                break;
            case 3:
                entre25y50++;
                break;
        }

        System.out.println("La cantidad de numeros menores a 15 es de: " + menores15);
        System.out.println("La cantidad de numeros mayores a 50 es de: " + mayores50);
        System.out.println("La cantidad de numeros entre 25 y 50 es de: " + entre25y50);

    }

    public static int clasificarNumero(int num) {
        if (num < 15) {
            return 1;
        } else if (num > 50) {
            return 2;
        } else if (num >= 25 && num <= 50) {
            return 3;
        } else {
            return 0;
        }
    }
}
