package sumatorias;

import java.util.Scanner;

/*Hallar la suma de los primeros N números pares. 
desplegar el resultado*/
public class Ej2Pares {

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
                    System.out.println("Debe ingresar ");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println("La suma de los " + numero + " primeros numeros pares es: " + sumaPares(numero));
    }

    public static int sumaPares(int num) {
        StringBuilder salida = new StringBuilder();
        int suma = 0;
        for (int i = 2; i <= num * 2; i+=2) {
            salida.append(i);
            suma = suma + i;
            if(i<num*2){
                salida.append(" + ");
            }
        }
        System.out.println(salida.toString()+"\n");
        return suma;
    }
}
