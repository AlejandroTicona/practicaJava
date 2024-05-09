package num1;

import java.util.Scanner;

public class Interes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de anios: ");
        int anios = sc.nextInt();
        System.out.println("Ingresa el porcentaje de interes: ");
        float perc = sc.nextFloat();
        System.out.println("Ingresa el monto de deposito: ");
        float monto = sc.nextFloat();
        float r = (float) ((monto) * (Math.pow((1 + (perc/100)), anios)));
        System.out.println("El interes compuesto es de: " + r);
    }
}
