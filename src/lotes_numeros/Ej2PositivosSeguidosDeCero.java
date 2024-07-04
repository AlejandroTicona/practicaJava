package lotes_numeros;
/*Dado un lote de n números determinar 
cuántas veces un número positivo esta seguido 
de un cero*/
import java.util.Scanner;

public class Ej2PositivosSeguidosDeCero {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        System.out.println("La cantidad de 0 despues de numeros positivos es: "+contarSeguidosCero(num));
    }

    private static int contarSeguidosCero(int num) {
        Scanner sc = new Scanner(System.in);
        int contador_cero = 0, n = 0;
        boolean isPositive = false;
        for (int i = 1; i <= num; i++) {
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
            if (n == 0 && isPositive == true) {
                contador_cero++;
            }
            isPositive = n > 0 ? true:false;
        }
        return contador_cero;
    }
}
