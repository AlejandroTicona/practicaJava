package lotes_numeros;
/*Encontrar el mayor de n números*/
import java.util.Scanner;

public class Ej13EncontrarElMayor {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        System.out.println("El mayor numero en el lote es: " + mayor(numero));
    }

    public static int mayor(int num) {
        Scanner sc = new Scanner(System.in);
        int n, mayor = -1;
        System.out.println("Ingresa el lote de " + num + " numeros");
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            if (n > mayor) {
                mayor = n;
            }
        }
        return mayor;
    }
}
