package estructuras_repetitivas;

import java.util.Scanner;

public class Ej6Mcm2 {

    /*siguiendo un tutorial para mejorar la logica*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, i = 2, mcm = 1;
        System.out.println("Ingresa el num1: ");
        num1 = sc.nextInt();
        System.out.println("Ingresa el num1: ");
        num2 = sc.nextInt();
        System.out.println("Ingresa el num1: ");
        num3 = sc.nextInt();

        while (i <= num1 || i <= num2 || i <= num3) {
            System.out.println("i" + i);
            if (num1 % i == 0 || num2 % i == 0 || num3 % i == 0) {
                if (num1 % i == 0) {
                    num1 = num1 / i;
                }
                if (num2 % i == 0) {
                    num2 = num2 / i;
                }
                if (num3 % i == 0) {
                    num3 = num3 / i;
                }
                mcm = mcm * i;
            } else {
                i++;
            }

        }
        System.out.println("El mcm es : " + mcm);

    }
}
