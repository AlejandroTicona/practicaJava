package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterosAscendentes3 {

    /*Pedir tres números enteros, 
    mostrar los números ordenados en forma 
    descendente (de mayor a menor).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero 1: ");
        int n1, n2, n3;
        try {
            n1 = sc.nextInt();
            System.out.println("Ingresa el numero 2: ");
            n2 = sc.nextInt();
            System.out.println("Ingresa el numero 3: ");
            n3 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar solo numeros");
            return;
        }

        //aqui esta una respuesta, esta muy anidada abajo hay otra respuest
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 > n3) {
                    System.out.println("1. " + n1 + "\n2. " + n2 + "\n3. " + n3);
                } else {
                    System.out.println("1. " + n1 + "\n2. " + n3 + "\n3. " + n2);
                }
            } else {
                System.out.println("1. " + n3 + "\n2. " + n1 + "\n3. " + n2);
            }
        } else {
            if (n2 > n3) {
                if (n3 > n1) {
                    System.out.println("1. " + n2 + "\n2. " + n3 + "\n3. " + n1);
                } else {
                    System.out.println("1. " + n2 + "\n2. " + n1 + "\n3. " + n3);
                }
            } else {
                System.out.println("1. " + n3 + "\n2. " + n2 + "\n3. " + n1);
            }
        }
        //aqui hay otra respuesta, es mas corta y optimizada
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println("-" + n1 + "-" + n2 + "-" + n3);
            } else {
                System.out.println("-" + n1 + "-" + n3 + "-" + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println("-" + n2 + "-" + n1 + "-" + n3);
            } else {
                System.out.println("-" + n2 + "-" + n3 + "-" + n1);
            }

        } else if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                System.out.println("-" + n3 + "-" + n1 + "-" + n2);
            } else {
                System.out.println("-" + n3 + "-" + n2 + "-" + n1);
            }
        } else {
            System.out.println("Todos los numeros son iguales");
        }
    }
}
