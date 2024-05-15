package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CuatroDigitos {

    /*
     Dado un número de cuatro dígitos mostrar el promedio 
    del primer y el último dígito. 
    Caso contrario mostrar la raíz cuadrada del número
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float promedio;
        int n;
        try {
            System.out.println("Ingresa un numero: ");
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un numero entero");
            return;
        }

        if (n >= 1000 && n <= 9999) {
            promedio = (float)((n % 10) + (n / 1000))/2;
            System.out.println("El promedio del primer y ultimo digito es: " + promedio);
        } else {
            System.out.println("La raiz del numero es " + (Math.sqrt(n)));
        }
    }
}
