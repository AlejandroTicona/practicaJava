package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiasFaltantes {

    /*Dada un fecha diga cuantos días 
    faltan para que acabe el año*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio = 0, mes = 0, dia = 0, ndia = 0;
        boolean bisiesto;
        try {
            System.out.println("Ingresa el dia: ");
            dia = sc.nextInt();
            System.out.println("Ingresa el mes: ");
            mes = sc.nextInt();
            System.out.println("Ingresa el anio: ");
            anio = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Solo se admiten numeros enteros");
        }
        if ((anio % 400 == 0) || (anio % 100 != 0 && anio % 4 == 0)) {
            bisiesto = true;
        } else {
            bisiesto = false;
        }

        //calculando los dias
        switch (mes) {
            case 1:
                if (bisiesto) {
                    ndia = 366 - dia;
                } else {
                    ndia = 365 - dia;
                }
                break;
            case 2:
                if (bisiesto) {
                    ndia = 366 - 31 - dia;
                } else {
                    ndia = 365 - 31 - dia;
                }
                break;
            case 3:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - dia;
                } else {
                    ndia = 365 - 31 - 28 - dia;
                }
                break;
            case 4:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - 31 - dia;
                } else {
                    ndia = 365 - 31 - 28 - 31 - dia;
                }
                break;
            case 5:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - 31 - 30 - dia;
                } else {
                    ndia = 365 - 31 - 28 - 31 - 30 - dia;
                }
                break;
            case 6:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - 31 - 30 - 31 - dia;
                } else {
                    ndia = 365 - 31 - 28 - 31 - 30 - 31 - dia;
                }
                break;
            case 7:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - 31 - 30 - 31 - 30 - dia;
                } else {
                    ndia = 365 - 31 - 28 - 31 - 30 - 31 - 30 - dia;
                }
                break;
            case 8:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - dia;
                } else {
                    ndia = 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - dia;
                }
                break;
            case 9:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - dia;
                } else {
                    ndia = 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - dia;
                }
                break;
            case 10:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - dia;
                } else {
                    ndia = 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - dia;
                }
                break;
            case 11:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - dia;
                } else {
                    ndia = 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - dia;
                }
                break;
            case 12:
                if (bisiesto) {
                    ndia = 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30 - dia;
                } else {
                    ndia = 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30 - dia;
                }
                break;
            default:
                System.out.println("Mes invalido");
                return;
        }
        System.out.println("Los dias restantes para el fin de año son:" + ndia);
    }
}
