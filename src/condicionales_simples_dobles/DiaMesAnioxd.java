package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaMesAnioxd {

    /*Pedir el día, mes y año de una fecha correcta 
    y mostrar la fecha del día siguiente. suponer 
    que todos los meses tienen 30 días.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        try {
            System.out.println("Ingresa el dia: ");
            dia = sc.nextInt();
            System.out.println("Ingresa el mes: ");
            mes = sc.nextInt();
            System.out.println("Ingresa el anio xd");
            anio = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar solo numeros enteros!!!");
            return;
        }

        if (dia > 0 && mes > 0 && anio > 0 && dia <= 30 && mes <= 12) {
            dia++;
            if (dia == 31) {
                dia = 1;
                mes++;
                if (mes == 13) {
                    mes = 1;
                    anio++;
                }
            }
        } else {
            System.out.println("Debes ingresar fechas validas ");
            return;
        }

        System.out.println("El dia siguiente es: \n" + dia + "/" + mes + "/" + anio);
    }
}
