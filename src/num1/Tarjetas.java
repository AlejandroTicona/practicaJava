package num1;

import java.util.Scanner;

public class Tarjetas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el monto inicial de la tarjeta: ");
        float mi = sc.nextFloat();
        System.out.println("Ingrese el monto final de la tarjeta: ");
        float mf = sc.nextFloat();
        float r = (float)(mi-mf);
        System.out.println("El costo de la llamada es de :"+(r+(r*0.2)));
    }
}
