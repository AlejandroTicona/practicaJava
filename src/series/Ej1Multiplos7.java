package series;

import java.util.Scanner;

/*generar y desplegar multiplos de 7*/
public class Ej1Multiplos7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingresa un numero entero mayor a 0: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debes ingresar un numero positivo");
                }
            } else {
                System.out.println("Debes ingresar un numero entero");
                sc.next();
            }
        }
        multiplo7(num);
    }

    public static void multiplo7(int num) {
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print(i * 7 + "\n");
            } else {
                System.out.print(i * 7 + " , ");
            }
        }
    }
}
