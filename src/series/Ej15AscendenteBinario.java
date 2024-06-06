package series;

import java.util.Scanner;

/*0, 1, 0, 2, 3, 0, 4, 5, 6, 0,*/
public class Ej15AscendenteBinario {

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

        serieBinariaAscendente(numero);
    }

    public static void serieBinariaAscendente(int num) {
        StringBuilder salidatexto = new StringBuilder();
        int sw = 0, salida = 0, contador = 1, cs = 1, s = 1;
        for (int i = 1; i <= num; i++) {
            salidatexto.append(salida);
            if (sw == 0) {
                salida = contador;
                sw = 1;
            } else {
                if (cs == s) {
                    salida = 0;
                    contador++;
                    s++;
                    cs = 1;
                    sw = 0;
                } else {
                    contador++;
                    salida = contador;
                    cs++;
                }
            }
            if (i < num) {
                salidatexto.append(" , ");
            }
        }
        System.out.println(salidatexto.toString());
    }
}
