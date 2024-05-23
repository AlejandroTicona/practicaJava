package estructuras_repetitivas;

import java.util.Scanner;

public class Ej7CocienteYResto {

    /*Calcular el cociente y resto de dos números 
    enteros positivos enteros a y b mediante restas 
    sucesivas.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean esNumero = false;
        while (!esNumero) {
            System.out.println("Ingrese el numero a dividir(1): ");
            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
                System.out.println("Ingrese el numero divisor(2): ");
                if (sc.hasNextInt()) {
                    num2 = sc.nextInt();
                    if (num1 > 0 && num2 > 0) {
                        esNumero = true;
                    } else {
                        System.out.println("Debe ingresar numeros positivos");
                    }
                } else {
                    System.out.println("Debe ingresar numeros enteros");
                    sc.next();
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        int c = 0;
        int residuo = num1;

        while (residuo >= num2) {
            residuo -= num2;
            c++;
        }

        System.out.println("El cociente es: " + c);
        System.out.println("El residuo es de: " + residuo);
    }

}
