package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiasSemana {

    /*
    Se desea escribir los nombres de los días de la semana
    en función del valor de una variable 
    d (1= lunes, …… 7=domingo).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        try {
            System.out.println("Ingresa el numero del dia 1-7: ");
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Solo son validos numeros enteros: ");
            return;
        }
        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El numero debe estar entre 1-7");
                return;
        }
    }
}
