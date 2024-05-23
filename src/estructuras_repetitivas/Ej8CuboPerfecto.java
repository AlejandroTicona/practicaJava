package estructuras_repetitivas;

import java.util.Scanner;

public class Ej8CuboPerfecto {

    /*
    Lea un número y diga si es o no un cubo perfecto, 
    los números Amstrong o cubos perfectos, 
    son aquellos que sumados los cubos de sus 
    dígitos nos dan el mismo número. 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean isNumber = false;
        System.out.println("Ingrese un numero entero positivo: ");
        while (!isNumber) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }

        cuboPerfecto(num);

    }

    public static void cuboPerfecto(int num) {
        int r = 0, num2 = num, c = 0;
        while (num != 0) {
            r = num % 10;
            c = (int) (c + (Math.pow(r, 3)));
            num = num / 10;
        }
        if (c == num2) {
            System.out.println("Es un numero narcisista:" + c);
        } else {
            System.out.println("No es un numero narcisista: " + c);
        }
    }
}
