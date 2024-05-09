package num1;

import java.util.Scanner;

public class DescProfesor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto pagado por hora: ");
        float monto = sc.nextFloat();
        float desc = (float) (monto * 0.05);
        System.out.println("Se paga un total de : " + monto + " descontando el monto de " + desc + " quedando asi un monto de " + (monto - desc));

    }
}
