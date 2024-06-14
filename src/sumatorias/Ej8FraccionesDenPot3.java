package sumatorias;

//2/3^3 - 4/5^3 + 6/7^3 - 8/9^3
import java.util.Scanner;

public class Ej8FraccionesDenPot3 {

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
                    System.out.println("Debe ingresar un numero entero");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println(sumatoriaFraccionDenPot3(numero));
    }

    private static float sumatoriaFraccionDenPot3(int num) {
        StringBuilder salida = new StringBuilder();
        int n = 2, d = 3;
        float suma = 0, m;
        for (int i = 1; i <= num; i++) {
            salida.append(n + "/" + d + "^3");
            m = (float) ((n) / (Math.pow(d, 3)));
            if (i % 2 == 1) {
                suma = suma + m;
                if (i < num) {
                    salida.append(" - ");
                }
            } else {
                suma = suma - m;
                if (i < num) {
                    salida.append(" + ");
                }
            }
            n += 2;
            d += 2;
        }
        System.out.println(salida.toString());
        return suma;
    }
}
