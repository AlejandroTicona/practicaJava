package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vocales {

    /*Se tiene como entrada una vocal, determinar si la misma 
    es un a vocal débil o una vocal fuerte.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vocal = "";
        try {
            System.out.println("Ingrese una vocal: ");
            vocal = sc.nextLine().toLowerCase();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un caracter valido");
            return;
        }
        switch (vocal) {
            case "a":
            case "e":
            case "o":
                System.out.println("Es una vocal fuerte");
                break;
            case "i":
            case "u":
                System.out.println("Es una vocal debil");
                break;
            default:
                System.out.println("Caracter invalido");
        }

    }
}
