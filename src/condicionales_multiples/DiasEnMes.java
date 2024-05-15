package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiasEnMes {

    /*Deducir el número de días de un mes m correspondiente 
    a un año a en función del número que le corresponde 
    dentro del calendario es decir: 1= enero, …. 12=diciembre.
    Además se debe tomar en cuenta si el año es bisiesto o no.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio, mes;
        boolean bisiesto;
        try {
            System.out.println("Ingrese el año(numero entero): ");
            anio = sc.nextInt();
            System.out.println("Ingrese el mes(numero entero): ");
            mes = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar solo numeros enteros");
            return;
        }
        //calculando si el anio es bisiesto o no
        //un anio es bisiesto cuando es divisible entre 400 o divisible entre 4 e indivisible entre 100
        if (anio % 400 == 0) {
            //si es divisible entre 400
            bisiesto = true;
        } else {
            if (anio % 4 == 0 && anio % 100 != 0) {
                //si es divisible entre 4 mas no 100
                bisiesto = true;
            } else {
                bisiesto = false;
            }
        }
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias");
                break;
            case 2:
                if (bisiesto) {
                    System.out.println("29 dias");
                } else {
                    System.out.println("28 dias");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dias");
                break;
            default:
                System.out.println("El mes debe estar entre 1-12");
        }
    }
}
