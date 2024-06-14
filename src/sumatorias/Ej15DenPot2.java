package sumatorias;
/*(1/(2^0) + (1/(2^1) + (1/(2^2) + (1/(2^3) + (1/(2^4)*/
import java.util.Scanner;

public class Ej15DenPot2 {

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
                    System.out.println("Debe ingresar un numero mayora 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println(denPot2(numero));
    }

    private static float denPot2(int numero) {
        StringBuilder salida = new StringBuilder();
        float ope = 0, suma = 0;
        for (int i = 0; i < numero; i++) {
            salida.append("(1/(2^" + i + ")");
            ope = (float) (1 / (Math.pow(2, i)));
            suma += ope;
            if (i < numero - 1) {
                salida.append(" + ");
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
