package descomposicion;

/*Dado un numero X, hallar la suma de sus dígitos.*/
import java.util.Scanner;

public class Ej1SumaDigitos {

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
        System.out.println(sumaDigitos(numero));
    }

    private static int sumaDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += (num % 10);
            num /= 10;
        }
        return suma;
    }
}
