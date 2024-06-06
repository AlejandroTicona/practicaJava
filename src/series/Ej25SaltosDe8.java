package series;

import java.util.Scanner;

/*2, 12, 30, 56, 90, ..*/
public class Ej25SaltosDe8 {

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

        saltosDe8(numero);
    }

    public static void saltosDe8(int num) {
        StringBuilder salida = new StringBuilder();
        int salto = 10, c = 2;
        for (int i = 1; i <= num; i++) {
            salida.append(c);
            c = c + salto;
            salto += 8;
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
