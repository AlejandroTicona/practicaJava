package estructuras_repetitivas;

import java.util.Scanner;

public class Ej5Mcd {

    /*HALLAR EL MCD MAXIMO COMUN DIVISOR DE 2 
    NUMEROS ENTEROS POSITIVOS*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MAXIMO COMUN DIVISOR");
        int num1 = 0, num2 = 0;
        boolean sonNumeros = false;
        while (!sonNumeros) {
            System.out.println("Ingresa el valor de n1: ");
            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
                System.out.println("Ingresa el valor de n2: ");
                if (sc.hasNextInt()) {
                    num2 = sc.nextInt();
                    if (num1 > 0 && num2 > 0) {
                        sonNumeros = true;
                    } else {
                        System.out.println("Debes ingresar numeros enteros positivos");
                    }
                } else {
                    System.out.println("Ambos deben ser numeros enteros positivos");
                    sc.next();

                }
            } else {
                System.out.println("Ambos deben ser numeros enteros positivos");
                sc.next();
            }
        }

        mcd(num1, num2);

    }

    //primer y mas obvio metodo pero no tan obtimo
    public static void mcd(int num1, int num2) {
        for (int i = num1; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("El MAXIMO COMUN DIVISOR DE " + num1 + " y " + num2 + " es de " + i);
                break;
            }
        }
    }

    //algoritmo de euclides
    public static int algoritmoEuclides(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
