package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DosDiasDespues {

    /* Dada una fecha válida halle la fecha
    de dos días después*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        boolean bisiesto = false;
        System.out.println("Ingrese el dia: ");
        try {
            dia = sc.nextInt();
            System.out.println("Ingrese el mes: ");
            mes = sc.nextInt();
            System.out.println("Ingrese el anio: ");
            anio = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Solo son validos los numeros enteros");
            return;
        }

        if (dia >= 0 && dia <= 31 && mes >= 1 && mes <= 12 && anio > 0) {
            if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)) {
                bisiesto = true;
            }

            if (bisiesto == true && mes == 2 && dia > 29) {
                System.out.println("El dia no es valido, es un anio bisiesto febrero tiene 29 dias!!!");
                return;
            } else if (bisiesto == false && mes == 2 && dia > 28) {
                System.out.println("El dia no es valido, es un anio no bisiesto febrero tiene 28 dias!!!");
                return;
            }

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:

                    if (dia == 31) {
                        mes++;
                        dia = 2;
                    } else if (dia == 30) {
                        mes++;
                        dia = 1;
                    } else {
                        dia = dia + 2;
                    }
                    break;
                case 2:
                    if (bisiesto) {
                        if (dia == 29) {
                            mes++;
                            dia = 2;
                        } else if (dia == 28) {
                            mes++;
                            dia = 1;
                        } else {
                            dia = dia + 2;
                        }
                    } else {
                        if (dia == 28) {
                            mes++;
                            dia = 2;
                        } else if (dia == 27) {
                            dia = 1;
                            mes++;
                        } else {
                            dia = dia + 2;
                        }
                    }
                    break;

                case 4:
                case 6:
                case 11:

                    if (dia == 30) {
                        mes++;
                        dia = 2;
                    } else if (dia == 29) {
                        mes++;
                        dia = 1;
                    } else {
                        dia = dia + 2;
                    }
                    break;
            }
        } else {
            System.out.println("Los datos no son validos!!!");
            return;
        }
        System.out.println("El siguiente dia es: " + dia + "/" + mes + "/" + anio);
    }
}
