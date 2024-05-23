package estructuras_repetitivas;

import java.util.Scanner;

/*
Dado dos números enteros positivos r y a, 
se desea saber si estos números son amigos.
Dos números se consideran amigos, si la suma 
de los divisores de uno es igual al otro 
número y viceversa.
 */
public class Ej11NumerosAmigos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0, a = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese el numero r: ");
            if (sc.hasNextInt()) {
                r = sc.nextInt();
                System.out.println("\nIngrese el numero a: ");
                if (sc.hasNextInt()) {
                    a = sc.nextInt();
                    if (r > 0 && a > 0) {
                        isNumber = true;
                    } else {
                        System.out.println("\nDebes ingresar numeros positivos");
                    }
                } else {
                    System.out.println("\nDebes ingresar un numero entero");
                    sc.next();
                }
            } else {
                System.out.println("\nDebes ingresar un numero entero");
                sc.next();
            }
        }
        if (sonAmigos(r, a)) {
            System.out.println("Son amigos");
        } else {
            System.out.println("No son amigos");
        }

    }

    public static boolean sonAmigos(int num1, int num2) {
        int suma_divisores1 = 0, suma_divisores2 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                suma_divisores1 = suma_divisores1 + i;
            }
        }

        for (int j = 1; j < num2; j++) {
            if (num2 % j == 0) {
                suma_divisores2 = suma_divisores2 + j;
            }
        }

        if (suma_divisores1 == num2 && suma_divisores2 == num1) {
            return true;
        }
        return false;
    }
}
