package series;

import java.util.Scanner;

/*0, 2, 3, 5, 8, 12, 19, 31, …*/
public class Ej20EsperoNoMeTomeMuchoTiempo {

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
                    System.out.println("El numero debe ser mayor a 0");
                }
            } else {
                System.out.println("El numero debe ser entero");
                sc.next();
            }
        }
        comoLeTeniaMiedoAEstaSeriexd(numero);
        //si era de miedo, estuvo jodidito al final
    }

    public static void comoLeTeniaMiedoAEstaSeriexd(int num) {
        StringBuilder salida = new StringBuilder();
        int mostrar = 0, nn = 2, ult = 0, n1 = 2, n2 = 3, t;
        for (int i = 1; i <= num; i++) {
            salida.append(mostrar);
            if (i < 3) {
                mostrar = nn;
                ult = nn;
                nn++;
            } else {
                int sw = (n2 % 2 == 0) ? 1 : 0;
                if (sw == 1) {
                    t = n1 + n2 - 1;
                } else {
                    t = n1 + n2;
                }
                n1 = n2;
                n2 = t;
                mostrar = t;
            }

            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
