package condicionales_simples_dobles;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n/2);
        }else{
            System.out.println(n*2);
        }
    }
}
