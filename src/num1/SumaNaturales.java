package num1;

import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros naturales a sumar: ");
        int n = sc.nextInt();
        float sumatoria = (float)((n*(n+1))/2);
        System.out.println("La sumatoria equivale a: "+sumatoria);
    }
}
