package secuenciales;

import java.util.Scanner;

public class Herencia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de la herencia: ");
        float herencia = sc.nextFloat();
        System.out.println("Al primero se le dará: "+(herencia*0.20)+"\nAl segundo se le dara: "+(herencia*0.35)+"\nAl tercero se le dara: "+(herencia*0.45));
    }
}
