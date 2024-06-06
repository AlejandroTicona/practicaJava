package series;

import java.util.Scanner;

/*1, 2, 6, 12, 25, 48, 91, 168, ………*/
public class Ej30PorFin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero: ");
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
        iPorFibonacci(numero);
    }

    public static void iPorFibonacci(int num) {
        StringBuilder salida = new StringBuilder();
        int n1 = 0, n2 = 1, t = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(t * i);
            t = n1 + n2;
            n1 = n2;
            n2 = t;
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
