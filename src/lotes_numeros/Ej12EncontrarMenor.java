package lotes_numeros;

import java.util.Scanner;

/*Encontrar el menor de n números*/
public class Ej12EncontrarMenor {
    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        System.out.println("El menor es: "+menor(num));
    }
    
    public static int menor(int num){
        Scanner sc=new Scanner(System.in);
        int menor = 2147483647, n;
        System.out.println("Ingresa los "+num+" numeros del lote: ");
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            if(n < menor){
                 menor = n;
            }
        }
        return menor;
    }
}
