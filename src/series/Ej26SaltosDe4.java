package series;

import java.util.Scanner;

/*1, -3, 5, -7, 9, -11, 13, …*/
public class Ej26SaltosDe4 {

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

        felicesLos4xd(numero);
    }

    /*1, -3, 5, -7, 9, -11, 13, …*/
    public static void felicesLos4xd(int num) {
        StringBuilder salida = new StringBuilder();
        int positivo = 1, negativo = -3, mostrar = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(mostrar);
            if (i % 2 == 1) {
                positivo += 4;
                mostrar = negativo;
            } else {
                negativo -= 4;
                mostrar = positivo;
            }
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
