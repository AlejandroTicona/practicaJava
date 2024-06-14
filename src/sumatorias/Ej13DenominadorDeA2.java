package sumatorias;

/*( 1 / 2 ) - ( 1 / 4 ) + ( 1 / 6 ) - ( 1 / 8 ) + ( 1 / 10 )*/
import java.util.Scanner;

public class Ej13DenominadorDeA2 {

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
                    System.out.println("Debe ingresar un numero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println(denominadorDeA2(numero));
    }

    private static float denominadorDeA2(int num) {
        StringBuilder salida = new StringBuilder();
        float suma = 0, ope = 0, den = 2;
        for (int i = 1; i <= num; i++) {
            salida.append("( 1 / " + (int) den + " )");
            ope = 1 / den;
            den += 2;
            if (i % 2 == 1) {
                suma += ope;
                if (i < num) {
                    salida.append(" - ");
                }
            } else {
                suma -= ope;
                if (i < num) {
                    salida.append(" + ");
                }
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
