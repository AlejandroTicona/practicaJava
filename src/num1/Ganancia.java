package num1;

import java.util.Scanner;

public class Ganancia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de meses: ");
        int meses = sc.nextInt();
        System.out.println("Ingresa el capital: ");
        float capital = sc.nextFloat();
        float ganancia = (float) (capital * (1.5/100)) * meses;
        System.out.println("La ganancia es de : " + ganancia);
    }
}
