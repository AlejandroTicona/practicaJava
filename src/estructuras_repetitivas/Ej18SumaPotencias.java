package estructuras_repetitivas;

import java.util.Scanner;

/*
    Representar cualquier número entero positivo 
    mediante suma de potencias de dos (2)
 */
public class Ej18SumaPotencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero positivo: ");
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

        descomponerEnPotenciasDeDos(numero);

    }

    public static void descomponerEnPotenciasDeDos(int num) {
        System.out.println("Representación mediante suma de potencias de dos: ");
        int potencia = 1;
        boolean primero = true;

        while (num > 0) {
            //Encuentra la mayor potencia de 2 menor o igual
            potencia = 1;
            int exponente = 0;
            while (potencia <= num) {
                potencia = potencia * 2;
                exponente++;
            }
            potencia = potencia / 2;
            exponente--;

            //resta la potencia de dos num
            num = num - potencia;

            if (primero) {
                System.out.print("2^" + exponente);
                primero = false;
            } else {
                System.out.print(" + 2^" + exponente);
            }
        }
        System.out.println();
    }
}
