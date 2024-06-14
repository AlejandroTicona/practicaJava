package sumatorias;

import java.util.Scanner;

/*ST = 7 - 1 - 2 + 14 - 3 - 4 + 21 - 5 - 6 + …*/
public class Ej10SaltosDe7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Debe ingresar un numero entero mayor a 0: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero entero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println(sumatoriaDe7(numero));

    }

    private static int sumatoriaDe7(int numero) {
        StringBuilder salida = new StringBuilder();
        int suma = 0, pos = 7, neg = 1, sw = 0, cs = 1;
        for (int i = 1; i <= numero; i++) {
            if (sw == 0) {
                if (i != 1) {
                    salida.append(" + ");

                }
                salida.append(pos);
                suma += pos;
                pos += 7;
                sw = 1;
            } else {
                salida.append(" - ");

                if (cs != 2) {
                    salida.append(neg);
                    suma -= neg;
                    neg++;
                    cs++;
                } else {
                    salida.append(neg);
                    suma -= neg;
                    neg++;
                    cs = 1;
                    sw = 0;
                }
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
