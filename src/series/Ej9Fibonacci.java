package series;

import java.util.Scanner;

/*un fibonacci de toda la vida*/
public class Ej9Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingresa un numero entero positivo: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero entero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }

        fibonacci(numero);
    }

    public static void fibonacci(int num) {
        StringBuilder salida = new StringBuilder();
        int n1 = 1, n2 = 0, s = 0;
        for (int i = 1; i <= num; i++) {
            salida.append(s);
            s = n1 + n2;
            n1 = n2;
            n2 = s;
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
