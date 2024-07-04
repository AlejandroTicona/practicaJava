package lotes_numeros;

import java.util.Scanner;

/*Dado un lote de z números, se pide: 
a. Determinar la cantidad de números primos y su suma. 
b. Determinar la cantidad de números perfectos y su suma. 
c. Determinar la cantidad de números no primos y su suma. 
d. Promedio total de los números 
 */
public class Ej18PrimosPerfectosCompuestos {

    public static void main(String[] args) {
        int z = MetodosUtiles.validacionNumero();
        int[] salida = determinando(z);
        System.out.println("La cantidad de numeros primos es: " + salida[0]);
        System.out.println("La suma de numeros primos es: " + salida[1]);
        System.out.println("La cantidad de numeros perfectos es: " + salida[2]);
        System.out.println("La suma de los numeros perfectos es: " + salida[3]);
        System.out.println("La cantidad de numeros no primos es:" + salida[4]);
        System.out.println("La suma de los no primos es: " + salida[5]);
        System.out.println("El promedio total de los numeros es: " + salida[6]);

    }

    public static int[] determinando(int num) {
        Scanner sc = new Scanner(System.in);
        int[] salida = new int[7];
        int n, cp = 0, cnp = 0, cpp = 0, suma_primo = 0, suma_noprimo = 0, suma_perfecto = 0, c = 0, promedio = 0;
        System.out.println("Ingresa los " + num + " numeros del lote: ");
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            if (primo(n)) {
                suma_primo += n;
                cp++;
            } else {
                suma_noprimo += n;
                cnp++;
            }

            if (perfecto(n)) {
                suma_perfecto += n;
                cpp++;
            }
            c++;
            promedio += n;
        }
        promedio /= c;
        salida[0] = cp;
        salida[1] = suma_primo;
        salida[4] = cnp;
        salida[5] = suma_noprimo;
        salida[2] = cpp;
        salida[3] = suma_perfecto;
        salida[6] = promedio;
        return salida;
    }

    public static boolean primo(int num) {
        if (num <= 1) {
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

    public static boolean perfecto(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }
}
