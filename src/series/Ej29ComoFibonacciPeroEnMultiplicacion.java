package series;

import java.util.Scanner;

/*0*1, 1*2, 3*5, 8*13, */
public class Ej29ComoFibonacciPeroEnMultiplicacion {

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
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        multiFibo(numero);
    }

    public static void multiFibo(int num) {
        StringBuilder salida = new StringBuilder();
        num = (num * 2);
        int n1 = -1, n2 = 1, acumulado = 0, sw = 0, t = 0;
        for (int i = 1; i <= num; i++) {
            if (sw == 0) {
                sw++;
                t = n1 + n2;
                n1 = n2;
                n2 = t;
                System.out.print(t + " * ");
            } else {
                sw = 0;
                t = n1 + n2;
                n1 = n2;
                n2 = t;
                System.out.print(t + " , ");
                acumulado = 1;
            }
        }
        System.out.println("");
        n1 = -1 ;
        n2 = 1;
        for (int i = 1; i <= num; i++) {
            if (sw == 0) {
                sw++;
                t = n1 + n2;
                n1 = n2;
                n2 = t;
                acumulado = 1 * t;
            } else {
                sw = 0;
                t = n1 + n2;
                n1 = n2;
                n2 = t;
                acumulado = acumulado * t;
                System.out.print(acumulado + "     , ");
                acumulado = 1;
            }
        }
    }

}
