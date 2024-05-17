package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SiguienteDia {

    /*Dada una fecha válida 
    halle la fecha del siguiente día.
     */
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

            switch (mes) {
                case 1:
                    if (dia == 31) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 2:
                    if (bisiesto) {
                        if (dia == 29) {
                            mes++;
                            dia = 1;
                        } else {
                            dia++;
                        }
                    } else {
                        if (dia == 28) {
                            mes++;
                            dia = 1;
                        } else {
                            dia++;
                        }
                    }
                    break;
                case 3:
                    if (dia == 31) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 4:
                    if (dia == 30) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 5:
                    if (dia == 31) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 6:
                    if (dia == 30) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 7:
                    if (dia == 31) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 8:
                    if (dia == 31) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 9:
                    if (dia == 31) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 10:
                    if (dia == 31) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 11:
                    if (dia == 30) {
                        mes++;
                        dia = 1;
                    } else {
                        dia++;
                    }
                    break;
                case 12:
                    if (dia == 31) {
                        mes = 1;
                        dia = 1;
                        anio++;
                    } else {
                        dia++;
                    }
                    break;
            }
        }
        System.out.println("El siguiente dia es: " + dia + "/" + mes + "/" + anio);
    }
}
