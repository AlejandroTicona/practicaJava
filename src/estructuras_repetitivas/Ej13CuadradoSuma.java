package estructuras_repetitivas;

import java.util.Scanner;

/*Hallar el cuadrado de un número entero 
positivo n en base a la suma de impares.
 */
public class Ej13CuadradoSuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero mayor a 0: ");
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

        System.out.println("\n" + cuboSuma(numero));
    }

    public static int cuboSuma(int num) {
        int suma = 0;
        for (int i = 0; i < num; i++) {
            int impar = 2 * i + 1;
            suma += impar;
        }
        return suma;
    }
}
