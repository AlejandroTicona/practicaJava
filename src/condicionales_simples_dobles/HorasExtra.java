package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HorasExtra {

    /*Calculo de los salarios mensuales de los empleados de una empresa, 
    sabiendo que éstos se calculan en base a las horas semanales 
    trabajadas y de acuerdo a un precio especificado por hora. 
    Si se pasan de cuarenta horas semanales, las horas extraordinarias 
    se pagarán a razón de 1.5 veces la hora ordinaria.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h_semanales1, h_semanales2, h_semanales3, h_semanales4;
        float h_precio;
        try {
            System.out.println("Ingresa la cantidad de horas trabajadas en la semana 1: ");
            h_semanales1 = sc.nextFloat();
            System.out.println("Ingresa la cantidad de horas trabajadas en la semana 2: ");
            h_semanales2 = sc.nextFloat();
            System.out.println("Ingresa la cantidad de horas trabajadas en la semana 3: ");
            h_semanales3 = sc.nextFloat();
            System.out.println("Ingresa la cantidad de horas trabajadas en la semana 4: ");
            h_semanales4 = sc.nextFloat();
            System.out.println("Ingresa el precio pagado por hora: ");
            h_precio = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Solo se admiten numeros!!!");
            return;
        }
        if (h_semanales1 > 40) {
            h_semanales1 = (float) (((h_semanales1 - 40) * h_precio) * 1.5) + (40 * h_precio);
        }
        if (h_semanales2 > 40) {
            h_semanales2 = (float) (((h_semanales2 - 40) * h_precio) * 1.5) + (40 * h_precio);

        }
        if (h_semanales3 > 40) {
            h_semanales3 = (float) (((h_semanales3 - 40) * h_precio) * 1.5) + (40 * h_precio);

        }
        if (h_semanales4 > 40) {
            h_semanales4 = (float) (((h_semanales4 - 40) * h_precio) * 1.5) + (40 * h_precio);
        }

        float total = h_semanales1 + h_semanales2 + h_semanales3 + h_semanales4;
        System.out.println("El total a pagar es: " + total);
    }
}
