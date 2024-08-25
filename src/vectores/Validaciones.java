package vectores;

import java.util.Scanner;

public class Validaciones {

    /**
     * Este metodo valida un numero entero ingresado mejorado, ya tiene un
     * limite
     *
     * @param inf es el limite inferior
     * @return devolvera un entero 100% real no fake xd
     */
    public static int validacionEntero(int inf) {
        Scanner sc = new Scanner(System.in);
        boolean isInt = false;
        int numero = 0;
        while (!isInt) {
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > inf && numero <= Integer.MAX_VALUE) {
                    isInt = true;
                } else {
                    System.out.println("Debe ingresar un numero mayor a " + inf);
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        return numero;
    }
}
