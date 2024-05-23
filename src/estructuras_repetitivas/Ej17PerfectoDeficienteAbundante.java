package estructuras_repetitivas;

import java.util.Scanner;

public class Ej17PerfectoDeficienteAbundante {

    /*Determinar si un numero es perfecto, deficiente o abundante*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingresa un numero entero positivo: ");
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

        if (verificar(numero) < numero) {
            System.out.println("El numero es deficiente " + numero + " la suma de sus divisores es menor: " + verificar(numero));
        }
        if (verificar(numero) > numero) {
            System.out.println("El numero es abundante " + numero + " la suma de sus divisores es mayor: " + verificar(numero));
        }
        if (verificar(numero) == numero) {
            System.out.println("El numero es perfecto "+numero+" la suma de sus divisores es igual al numero "+verificar(numero));
        }
    }

    public static int verificar(int num) {
        //verificando si es un numero perfecto, deficiente o 
        //abundante en base a la suma de sus divisores
        int suma = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        return suma;
    }
}
