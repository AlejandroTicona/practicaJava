package estructuras_repetitivas;

import java.util.Scanner;

public class Ej9PrimerosPrimos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingresa un numero entero positivo: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debes ingresar un numero positivo");
                }
            } else {
                System.out.println("Debes ingresar un numero entero");
                sc.next();
            }
        }

        nPrimos(num);
    }

    public static void nPrimos(int num) {
        for (int i = 2; i <= num; i++) {
            int c = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 0) {
                System.out.println(i);
            }
        }
    }
}
