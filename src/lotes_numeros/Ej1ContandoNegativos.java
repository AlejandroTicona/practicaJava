package lotes_numeros;

import java.util.Scanner;

/*Lee n números y mostrar cuantos 
números negativos se han leído. */
public class Ej1ContandoNegativos {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        System.out.println("La cantidad de negativos es: " + contandoNegativos(numero));
    }

    public static int contandoNegativos(int num) {
        Scanner sc = new Scanner(System.in);
        int cantidad_negativos = 0;
        float n;

        for (int i = 1; i <= num; i++) {
            System.out.println("Ingrese un numero: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Entrada invalida. Ingrese un numero");
                sc.next();
            }
            n = sc.nextInt();
            if (n < 0) {
                cantidad_negativos++;
            }
        }
        sc.close();
        return cantidad_negativos;
    }
}
