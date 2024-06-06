package series;

import java.util.Scanner;

/*0, 2, 6, 12, 20, 30,...*/
public class Ej8Combinacion2 {

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
                    System.out.println("Debes ingresar un numero positivo");
                }
            } else {
                System.out.println("Debes ingresar un numero entero");
                sc.next();
            }
        }
        multiplicacionAnteriorSerie(numero);
    }

    public static void multiplicacionAnteriorSerie(int num) {
        StringBuilder salida = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            salida.append(i * (i - 1));
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
