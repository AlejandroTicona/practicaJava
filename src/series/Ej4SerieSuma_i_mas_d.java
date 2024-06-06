package series;

import java.util.Scanner;

/*
    Generar y desplegar los N números que tengan la forma
    siguiente: 1, 2, 4, 7, 11,...
 */
public class Ej4SerieSuma_i_mas_d {

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
                    System.out.println("Ingrese un numero mayor a 0");
                }
            } else {
                System.out.println("Debes ingresar un numero entero");
                sc.next();
            }
        }

        serieSuma(numero);
    }

    public static void serieSuma(int num) {
        int d = 1;
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print(d + "\n");
            } else {
                System.out.print(d + " , ");
            }
            d = d + i;
        }
    }
}
