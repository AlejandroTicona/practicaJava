package num1;

import java.util.Scanner;

public class Moneda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de Bs: ");
        float bs = sc.nextFloat();
        System.out.println("Los "+bs+"Bs. equivalen a "+(bs*0.14)+" dolares");
    }
}
