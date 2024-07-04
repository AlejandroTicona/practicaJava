package lotes_numeros;

import java.util.Scanner;

/* Introducir números enteros positivos finalizar cuando 
introduzca el -999, para cada número introducido, se pide: 
a. Si el número es par, calcular su factorial. 
b. Si el número es impar, verificar si es primo 
c. Si el número es impar y además es múltiplo de tres, 
mostrar la suma de sus divisores*/
public class Ej21_999 {

    public static void main(String[] args) {
        salida();
    }

    public static void salida() {
        Scanner sc = new Scanner(System.in);
        StringBuilder par = new StringBuilder();
        StringBuilder impar = new StringBuilder();
        StringBuilder mult3 = new StringBuilder();
        boolean is999 = false;
        int n;
        System.out.println("Ingrese el lote de numeros: ");
        while (!is999) {
            n = MetodosUtiles.validacionNumero999();
            is999 = n == -999 ? true : false;
            if (n % 2 == 0) {
                int factorial = factorial(n);
                par.append(factorial + " ,");
            } else {
                if(n%3==0){
                    int suma = sumaDivisores(n);
                    mult3.append(n+" = "+suma+" , ");
                }
                impar.append(n + ", ");
            }
        }
        System.out.println("Los factoriales de los pares son: "+par);
        System.out.println("Los impares primos son: "+impar);
        System.out.println("Las sumas de los divisores de impares multiplos de 3 son las siguientes: \n"+mult3);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean primo(int num) {
        if (num <= 0) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int sumaDivisores(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
