package secuenciales;

import java.util.Scanner;

public class DosFechas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dia de la fecha 1: ");
        int d1 = sc.nextInt();
        System.out.println("Ingresa el mes de la fecha 1: ");
        int m1 = sc.nextInt();
        System.out.println("Ingresa el dia de la fecha 2: ");
        int d2 = sc.nextInt();
        System.out.println("Ingresa el mes de la fecha 2: ");
        int m2 = sc.nextInt();

        int r = (d2 + (m2 * 30)) - (d1 + (m1 * 30));
        System.out.println("La cantidad de dias entre la fecha " + d1 + "/" + m1 + " - " + d2 + "/" + m2 + " es de " + r + " dias");
    }
}
