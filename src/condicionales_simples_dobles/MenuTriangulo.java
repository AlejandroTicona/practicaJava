package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTriangulo {

    /*Que muestre un menú donde las opciones sean 
    “Equilátero”, “Isósceles” y “Escaleno”, pida 
    una opción y calcule el perímetro del triángulo 
    seleccionado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        float l1, l2, l3, perimetro = 0;
        try {
            System.out.println("De cual tipo de triangulo quiere calcular el perimetro?\n1.Equilatero\n2.Isosceles\n3.Escaleno");
            opc = sc.nextInt();
            if (opc == 1 || opc == 2 || opc == 3) {
                if (opc == 1) {
                    System.out.println("Ingresa uno de los lados: ");
                    l1 = sc.nextFloat();
                    perimetro = l1 * 3;
                } else if (opc == 2) {
                    System.out.println("Ingresa la base: ");
                    l1 = sc.nextFloat();
                    System.out.println("Ingresa uno de los otros dos lados");
                    l2 = sc.nextFloat();
                    perimetro = l1 + (l2 * 2);
                } else if (opc == 3) {
                    System.out.println("Ingresa el lado 1: ");
                    l1 = sc.nextFloat();
                    System.out.println("Ingresa el lado 2: ");
                    l2 = sc.nextFloat();
                    System.out.println("Ingresa el lado 3: ");
                    l3 = sc.nextFloat();
                    perimetro = l1 + l2 + l3;
                }
            } else {
                System.out.println("Opcion invalida");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar solo numeros");
            return;
        }

        System.out.println("El perimetro es de : " + perimetro);
    }
}
