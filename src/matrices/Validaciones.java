package matrices;

import java.util.Scanner;

public class Validaciones {

    public static int validacionEntero(int limite_inferior) {
        Scanner sc = new Scanner(System.in);
        boolean isInt = false;
        int n = 0;
        while (!isInt) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > limite_inferior) {
                    isInt = true;
                } else {
                    System.out.println("Debe ser mayor a " + limite_inferior);
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        return n;
    }
}
