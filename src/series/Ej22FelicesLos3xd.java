package series;

import java.util.Scanner;

/*1, 1, 1, 3, 5, 9, 17, 31, …*/
public class Ej22FelicesLos3xd {

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
                    System.out.println("Debe ingresar un numero mayor a 0: ");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        serieDe3(numero);
    }

    public static void serieDe3(int num) {
        StringBuilder salida = new StringBuilder();
        int t, n1 = 1, n2 = 1, n3 = 1, mostrar = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(mostrar);
            if (i < 3) {
                mostrar = 1;
            } else {
                t = n1 + n2 + n3;
                n1 = n2;
                n2 = n3;
                n3 = t;
                mostrar = t;
            }

            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
