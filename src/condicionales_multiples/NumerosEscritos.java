package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosEscritos {

    /*Pedir un número de 0 a 99 y mostrarlo escrito. 
    Por ejemplo, para 56 mostrar: 
    cincuenta y seis.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, men20, decena, unidad;
        String ucadena = "", dcadena = "";
        System.out.println("Ingresa un numero entre 0 y 99: ");
        try {
            numero = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero");
            return;
        }
        if (numero >= 0 && numero <= 99) {
            men20 = numero % 20;
            decena = numero / 10;
            unidad = numero % 10;

            switch (numero) {
                case 10:
                    System.out.println("diez");
                    return;
                case 20:
                    System.out.println("veinte");
                    return;
                case 30:
                    System.out.println("treinta");
                    return;
                case 40:
                    System.out.println("cuarenta");
                    return;
                case 50:
                    System.out.println("cincuenta");
                    return;
                case 60:
                    System.out.println("sesenta");
                    return;
                case 70:
                    System.out.println("setenta");
                    return;
                case 80:
                    System.out.println("ochenta");
                    return;
                case 90:
                    System.out.println("noventa");
                    return;
            }

            if (numero < 20) {
                switch (men20) {
                    case 1:
                        ucadena = "uno";
                        break;
                    case 2:
                        ucadena = "dos";
                        break;
                    case 3:
                        ucadena = "tres";
                        break;
                    case 4:
                        ucadena = "cuatro";
                        break;
                    case 5:
                        ucadena = "cinco";
                        break;
                    case 6:
                        ucadena = "seis";
                        break;
                    case 7:
                        ucadena = "siete";
                        break;
                    case 8:
                        ucadena = "ocho";
                        break;
                    case 9:
                        ucadena = "nueve";
                        break;
                    case 11:
                        ucadena = "once";
                        break;
                    case 12:
                        ucadena = "doce";
                        break;
                    case 13:
                        ucadena = "trece";
                        break;
                    case 14:
                        ucadena = "catorce";
                        break;
                    case 15:
                        ucadena = "quince";
                        break;
                    case 16:
                        ucadena = "dieciseis";
                        break;
                    case 17:
                        ucadena = "diecisiete";
                        break;
                    case 18:
                        ucadena = "dieciocho";
                        break;
                    case 19:
                        ucadena = "diecinueve";
                        break;
                    default:
                        ucadena = "";
                }
            } else {

                switch (unidad) {
                    case 1:
                        ucadena = "uno";
                        break;
                    case 2:
                        ucadena = "dos";
                        break;
                    case 3:
                        ucadena = "tres";
                        break;
                    case 4:
                        ucadena = "cuatro";
                        break;
                    case 5:
                        ucadena = "cinco";
                        break;
                    case 6:
                        ucadena = "seis";
                        break;
                    case 7:
                        ucadena = "siete";
                        break;
                    case 8:
                        ucadena = "ocho";
                        break;
                    case 9:
                        ucadena = "nueve";
                        break;
                }

            }

            switch (decena) {
                case 1:
                    dcadena = "";
                    break;
                case 2:
                    dcadena = "veinti";
                    break;
                case 3:
                    dcadena = "treinta y ";
                    break;
                case 4:
                    dcadena = "cuarenta y ";
                    break;
                case 5:
                    dcadena = "cincuenta y ";
                    break;
                case 6:
                    dcadena = "sesenta y ";
                    break;
                case 7:
                    dcadena = "setenta y ";
                    break;
                case 8:
                    dcadena = "ochenta y ";
                    break;
                case 9:
                    dcadena = "noventa y ";
                    break;
                default:
                    dcadena = "";
            }
        } else {
            System.out.println("Debe ingresar un numero entre 0 y 99");
            return;
        }
        System.out.println(dcadena + "" + ucadena);

    }
}
