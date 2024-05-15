package secuenciales;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura Celsius: ");
        float cel = sc.nextFloat();
        float fah = (float)(((cel*(9.0/5.0)))+32);
        System.out.println("La temperatura "+cel+" equivale a "+fah+" fahrenheit");
    }
}
