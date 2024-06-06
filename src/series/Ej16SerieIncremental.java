package series;

import java.util.Scanner;

/*0, 1, 2, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 5, 6, …*/
public class Ej16SerieIncremental {

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
                    System.out.println("Debe ingresar un numero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        serieIncremental(numero);
    }

    /*0, 1, 2, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 5, 6, …*/
    public static void serieIncremental(int num) {
        StringBuilder salidaConsola = new StringBuilder();
        int cs = 1, s = 2, sw = 0, salida = 0;
        for (int i = 1; i <= num; i++) {
            salidaConsola.append(salida);
            if (sw == 0) {
                sw = 1;
                salida = cs;
            } else {
                if (cs == s) {
                    sw = 0;
                    salida = sw;
                    s = s + 2;
                    cs = 1;
                } else {
                    cs++;
                    salida = cs;
                }
            }
            if (i < num) {
                salidaConsola.append(" , ");
            }
        }
        System.out.println(salidaConsola.toString());
    }
}
