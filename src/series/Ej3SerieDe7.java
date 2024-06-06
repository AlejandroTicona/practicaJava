package series;

import java.util.Scanner;

/*
     Generar y desplegar los N números que tengan 
    la forma siguiente: 1, 8, 15, 22, 29,...
 */
public class Ej3SerieDe7 {

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
                System.out.println("Debes ingresar un numero entero: ");
                sc.next();
            }
        }

        serie7(numero);
    }

    public static void serie7(int num) {
        int n = 1;
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print(n + "\n");
            } else {
                System.out.print(n + " , ");
            }
            n = n + 7;
        }
    }
}
