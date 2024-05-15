package secuenciales;

import java.util.Scanner;

public class SueldoBono {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float sueldo,  bono;
        System.out.println("Ingrese el monto del sueldo: ");
        sueldo = sc.nextFloat();
        System.out.println("Ingrese la cantidad de hijos: ");
        int hijos = sc.nextInt();
        System.out.println("Ingrese el bono por hijo");
        bono = sc.nextFloat();
        System.out.println("El total a pagar es de: "+((bono*hijos)+sueldo));
    }
}
