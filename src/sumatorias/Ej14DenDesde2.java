package sumatorias;
/*(1 / 2) - (1 / 3) + (1 / 4) - (1 / 5) + (1 / 6)*/
import java.util.Scanner;

public class Ej14DenDesde2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero mayor a 0: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Ingrese un numero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println(DenDesde2(numero));
    }

    private static float DenDesde2(int numero) {
        StringBuilder salida = new StringBuilder();
        float suma = 0, ope = 0;
        int den = 2;
        for (int i = 1; i <= numero; i++) {
            salida.append("(1 / " + den + ")");
            ope = (float) 1 / den;
            if (i % 2 == 1) {
                suma += ope;
                if (i < numero) {
                    salida.append(" - ");
                }
            } else {
                suma -= ope;
                if (i < numero) {
                    salida.append(" + ");
                }
            }
            den++;
        }
        System.out.println(salida.toString());
        return suma;
    }
}
