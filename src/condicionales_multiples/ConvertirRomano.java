package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertirRomano {

    /*Dado un número menor a 4000 conviértalo a 
    su número en romano. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, c_unidad, c_decena, c_centena, c_mil;
        String unidades = "", decenas = "", centenas = "", unidades_mil = "";
        try {
            System.out.println("Ingrese el numero romano a convertir menor a 4000");
            numero = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Solo son validos los numeros enteros");
            return;
        }

        c_unidad = numero % 10;
        c_decena = (numero % 100) / 10;
        c_centena = (numero % 1000) / 100;
        c_mil = (numero / 1000);

        switch (c_unidad) {
            case 1:
                unidades = "I";
                break;
            case 2:
                unidades = "II";
                break;
            case 3:
                unidades = "III";
                break;
            case 4:
                unidades = "IV";
                break;
            case 5:
                unidades = "V";
                break;
            case 6:
                unidades = "VI";
                break;
            case 7:
                unidades = "VII";
                break;
            case 8:
                unidades = "VIII";
                break;
            case 9:
                unidades = "IX";
                break;
            default:

        }

        switch (c_decena) {
            case 1:
                decenas = "X";
                break;
            case 2:
                decenas = "XX";
                break;
            case 3:
                decenas = "XXX";
                break;
            case 4:
                decenas = "XL";
                break;
            case 5:
                decenas = "L";
                break;
            case 6:
                decenas = "LX";
                break;
            case 7:
                decenas = "LXX";
                break;
            case 8:
                decenas = "LXXX";
                break;
            case 9:
                decenas = "XC";
                break;
            default:

        }

        switch (c_centena) {
            case 1:
                centenas = "C";
                break;
            case 2:
                centenas = "CC";
                break;
            case 3:
                centenas = "CCC";
                break;
            case 4:
                centenas = "CD";
                break;
            case 5:
                centenas = "D";
                break;
            case 6:
                centenas = "DC";
                break;
            case 7:
                centenas = "DCC";
                break;
            case 8:
                centenas = "DCCC";
                break;
            case 9:
                centenas = "CM";
                break;
            default:

        }

        switch (c_mil) {
            case 1:
                unidades_mil = "M";
                break;
            case 2:
                unidades_mil = "MM";
                break;
            case 3:
                unidades_mil = "MMM";
                break;
            default:
        }
        System.out.println(c_centena);
        System.out.println(numero+" Equivale a :\n"+unidades_mil+centenas+decenas+unidades);
    }
}
