package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MayorMenor {

    /*Dados dos números enteros, mostrar ordenados en forma ascendente(primero el 
    número menor seguido del mayor)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2;
        System.out.println("Ingresa el primer valor: ");
        try {
            n1 = sc.nextFloat();
            System.out.println("Ingresa el segundo valor: ");
            n2 = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Deben ser numeros!!!");
            return;
        }

        if (n1 < n2) {
            System.out.println(n1 + "\n" + n2);
        } else {
            System.out.println(n2 + "\n" + n1);
        }
    }
}
