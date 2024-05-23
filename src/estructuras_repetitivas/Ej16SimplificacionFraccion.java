package estructuras_repetitivas;

import java.util.Scanner;

/*Sean dos números que representan el 
    numerador y denominador respectivamente, 
    realizar la simplificación de la fracción 
    a su mínima expresión.*/
public class Ej16SimplificacionFraccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerador = 0, denominador = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese el numerador: ");
            if (sc.hasNextInt()) {
                numerador = sc.nextInt();
                System.out.println("Ingrese el denominador");
                if (sc.hasNextInt()) {
                    denominador = sc.nextInt();
                    if (numerador > 0 && denominador > 0) {
                        isNumber = true;
                    } else {
                        System.out.println("Debe ingresar numeros mayores a 0");
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
        simplificaFraccion(numerador, denominador);

    }

    public static void simplificaFraccion(int numerador, int denominador) {
        int maximo_divisor = calcularMCD(numerador, denominador);

        numerador = numerador / maximo_divisor;
        denominador = denominador / maximo_divisor;

        System.out.println("La funcion simplificada es: " + numerador + "/" + denominador);
    }

    //quien lo hubiera dicho esto se resuelve mejor con el mcd
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
