package num1;

import java.util.Scanner;

public class Segundos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los numeros a convertir a horas: ");
        int s = sc.nextInt();
        System.out.println((s / 3600) + ":" + (((s % 3600) / 60)) + ":" + s % 60);
    }
}
