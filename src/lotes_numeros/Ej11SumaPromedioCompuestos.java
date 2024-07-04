package lotes_numeros;

import java.util.Scanner;

/*Dado un conjunto de n números mostrar 
la suma de todos aquellos que no son primos y 
su promedio*/
public class Ej11SumaPromedioCompuestos {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        int[] salida = sumaPromedioCompuestos(num);
        System.out.println("La suma de los numeros no primos es: " + salida[0] + "\nEl promedio de los mismos es: " + (salida[0] / salida[1]));
    }

    public static int[] sumaPromedioCompuestos(int num) {
        Scanner sc = new Scanner(System.in);
        int[] salida = new int[2];
        int n = 0, suma_compuestos = 0, c = 0;
        System.out.println("Ingresa los " + num + " numeros del lote: ");
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            if (n == 1) {
                suma_compuestos += n;
                c++;
            } else {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        suma_compuestos += n;
                        c++;
                        break;
                    }
                }
            }
            salida[0] = suma_compuestos;
            salida[1] = c;
        }
        return salida;
    }
}
