package secuenciales;

import java.util.Scanner;

public class HoraArbitraria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la hora: ");
        int hora = sc.nextInt();
        System.out.println("Ingresa los minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Ingresa los segundos: ");
        int segundos = sc.nextInt();
        int segmin = segundos/60;
        segundos = segundos%60;
        minutos = segmin+minutos;
        int minhor = minutos /60;
        minutos = minutos%60;
        hora = hora + minhor;
        System.out.println(hora+"h "+minutos+"m "+segundos+" s");
        
    }
}
