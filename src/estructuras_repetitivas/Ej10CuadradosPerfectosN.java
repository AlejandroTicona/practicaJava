package estructuras_repetitivas;

import java.util.Scanner;

/*Dado un numero N, desplegar los cuadrados 
perfectos anteriores al número N*/
public class Ej10CuadradosPerfectosN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero mayor a 0: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero");
                sc.next();
            }
        }

        desplegarCuadradosPerfectos(num);
    }

    public static boolean esCuadradoPerfecto(int num) {
//        if ((Math.sqrt(num) % 1 == 0)) {
//            return true;
//        }
//        return false;
        return Math.sqrt(num) % 1 == 0;
    }

    public static void desplegarCuadradosPerfectos(int num) {
        for (int i = 1; i <= num; i++) {
            if (esCuadradoPerfecto(i)) {
                System.out.println(i + " es un cuadrado perfecto");
            }
        }
    }
}
