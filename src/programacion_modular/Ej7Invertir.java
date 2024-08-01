package programacion_modular;

import java.util.Scanner;

/*Escriba una función que reciba un valor entero 
y devuelva el número con sus dígitos 
invertidos. Por ejemplo, para el número 7631, 
la función debe regresar 1367.*/
public class Ej7Invertir {

    public static void main(String[] args) {
        int num = validarMayor9();
        System.out.println(invertir(num));
    }

    public static int invertir(int num) {
        int nn = 0;
        while (num > 0) {
            nn = nn * 10;
            nn = nn + ((num % 10));
            num /= 10;
        }
        return nn;
    }

    public static int validarMayor9() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Ingrese un numero mayor a 9: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num > 9) {
                    isValid = true;
                } else {
                    System.out.println("Debe ingresar un numero mayor a 9: ");
                }
            } else {
                System.out.println("Debe ingresar un numero entero: ");
                sc.next();
            }
        }
        return num;
    }
}
