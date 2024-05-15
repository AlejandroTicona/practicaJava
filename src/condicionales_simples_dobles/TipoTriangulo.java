package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TipoTriangulo {

    /*Dado tres números que serán los lados de un triangulo, 
    indicar que tipo de triangulo es, sabiendo que si tiene 
    los tres lados iguales es un triangulo equilátero, 
    si tiene dos lados iguales es un triangulo isósceles 
    y si tiene los tres lados distintos es un triangulo 
    escaleno.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l1, l2, l3;
        try {
            System.out.println("Ingresa el lado 1 del triangulo: ");
            l1 = sc.nextFloat();
            System.out.println("Ingresa el lado 2 del triangulo: ");
            l2 = sc.nextFloat();
            System.out.println("Ingresa el lado 3 del triangulo: ");
            l3 = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Solo están permitidos números!!!");
            return;
        }

        if (l1 != l2 && l1 != l3 && l2 != l3) {
            System.out.println("Es un triangulo escaleno");
        } else {
            if (l1 == l2 && l2 == l3) {
                System.out.println("Es un triangulo equilaterio");
            } else {
                System.out.println("Es un triangulo isoceles");
            }
        }
    }
}
