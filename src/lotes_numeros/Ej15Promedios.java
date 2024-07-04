package lotes_numeros;

import java.util.Scanner;

public class Ej15Promedios {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        int[] salida = promedios(num);
        System.out.println("El promedio de los pares es: " + salida[0] + "\nEl promedio de los impares es: " + salida[1] + "\nLa suma de todos los numeros es: " + salida[2] + "El promedio de todo es: " + salida[3]);
    }

    public static int[] promedios(int num) {
        Scanner sc = new Scanner(System.in);
        int salida[] = new int[4];
        int p_par = 0, p_impar = 0, suma = 0, p_general, n, c = 0, c_par = 0, c_impar = 0;
        System.out.println("Ingresa el lote de " + num + " numeros");
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            suma += n;
            c++;
            if (n % 2 == 0) {
                c_par++;
                p_par += n;
            } else {
                c_impar++;
                p_impar += n;
            }
        }
        salida[0] = (p_par / c_par);
        salida[1] = (p_impar / c_impar);
        salida[2] = (suma);
        salida[3] = (suma / c);
        return salida;
    }

}
