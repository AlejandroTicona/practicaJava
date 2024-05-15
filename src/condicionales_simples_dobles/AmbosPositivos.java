package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AmbosPositivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0, n2 = 0;
        try {
            System.out.println("Ingresa el numero 1: ");
            n1 = sc.nextFloat();
            System.out.println("Ingresa el numero 2: ");
            n2 = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Solo se admiten numeros");
            return;
        }
        
        if(n1 > 0 && n2>0){
            System.out.println("Ambos numeros "+n1+" y "+n2+" son positivos");
        }else{
            System.out.println("Uno de los 2 no es positivo");
        }
        

    }
}
