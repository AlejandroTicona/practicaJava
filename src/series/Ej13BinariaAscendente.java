package series;

import java.util.Scanner;

/*0, 1, 0, 0, 1 , 1, 0, 0, 0, 1, 1, 1, 0, 0,…*/
public class Ej13BinariaAscendente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero positivo: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero positivo");
                }
            } else {
                sc.next();
                System.out.println("Debe ingresar un numero entero");
            }
        }
        binarioAscendente(numero);
    }

    public static void binarioAscendente(int num) {
        StringBuilder salida = new StringBuilder();
        int sw = 0, s = 1, cs = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(sw);
            if (sw == 1) {
                if (cs == s) {
                    sw = 0;
                    s++;
                    cs = 1;
                } else {
                    cs++;
                }
            } else {
                if (cs == s) {
                    sw = 1;
                    cs = 1;
                } else {
                    cs++;
                }
            }
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
