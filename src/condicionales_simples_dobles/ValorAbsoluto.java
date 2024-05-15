package condicionales_simples_dobles;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el valor a convertir en absoluto: ");
        float va = sc.nextFloat();
        if(va < 0){
            va = va * -1;
        }
        System.out.println("El valor absoluto de "+va);
    }
}
