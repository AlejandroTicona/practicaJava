package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        System.out.println("Ingrese su edad: ");
        try {
            edad = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar solo un numero entero");
            return;
        }

        if (edad > 0 && edad < 15) {
            System.out.println("Usted es un ninio");
        } else if (edad >= 15 && edad < 30) {
            System.out.println("Usted es joven");
        } else if (edad >= 30 && edad <= 55) {
            System.out.println("Usted es adulto");
        } else if (edad > 55) {
            System.out.println("Usted es adulto mayor");
        } else {
            System.out.println("Los datos ingresados son incorrectos ");
        }
    }
}
