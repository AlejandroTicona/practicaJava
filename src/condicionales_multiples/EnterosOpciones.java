package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterosOpciones {

    /*Ingrese dos números enteros y seleccione una 
    opción que pueda sumar, restar, dividir o multiplicar 
    los números, muestre el resultado por pantalla.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, opc = 0;
        float r = 0;
        try {
            System.out.println("Ingrese el numero 1: ");
            n1 = sc.nextInt();
            System.out.println("Ingrese el numero 2: ");
            n2 = sc.nextInt();
            System.out.println("Seleccione la operacion que desea realizar: \n1.suma\n2.resta\n3.division\n4.multiplicacion");
            opc = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar solo numeros");
        }

        switch (opc) {
            case 1:
                System.out.println("OPCION SUMA");
                r = n1 + n2;
                break;
            case 2:
                System.out.println("OPCION RESTA");
                r = n1 - n2;
                break;
            case 3:
                System.out.println("OPCION DIVISION");
                r = (float) n1 / n2;
                break;
            case 4:
                System.out.println("OPCION MULTIPLICACION");
                r = n1 * n2;
                break;
            default:
                System.out.println("Opcion invalida");
                return;
        }
        System.out.println("El resultado es: " + r);
    }
}
