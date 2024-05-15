package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HoraDespues {

    /*Que lea una hora en hora: minutos: segundos y diga la hora 
    que es un segundo después*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo;
        try {
            System.out.println("Ingresa la hora: ");
            hora = sc.nextInt();
            System.out.println("Ingresa el minuto: ");
            minuto = sc.nextInt();
            System.out.println("Ingresa el segundo: ");
            segundo = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar solo numeros enteros");
            return;
        }
        if (segundo > 0 && minuto > 0 && hora > 0 && segundo < 60 && minuto < 60 && hora <= 12) {
            if (segundo <= 58) {
                segundo = segundo + 1;
            } else {
                if (minuto <= 58) {
                    segundo = 0;
                    minuto = minuto + 1;
                } else {
                    if (hora <= 11) {
                        segundo = 0;
                        minuto = 0;
                        hora = hora + 1;
                    } else {
                        segundo = 0;
                        minuto = 0;
                        hora = 1;
                    }
                }
            }
        } else {
            System.out.println("Ingresa una hora valida");
            return;
        }

        System.out.println("La hora es: \n" + hora + ":" + minuto + ":" + segundo);
        //el codigo puede ser mas optimo de la siguiente manera validando mientras se incrementa wow
        System.out.println("OTRA RESPUESTA MAS OPTIMA: \n------------------------------");
        //le vamos a aumentar otro 1
        segundo++;
        if (segundo == 60) {
            minuto++;
            segundo = 0;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 13) {
                    hora = 1;
                }
            }
        }
        System.out.println("La hora con el mejor codigo es: ");
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
}
