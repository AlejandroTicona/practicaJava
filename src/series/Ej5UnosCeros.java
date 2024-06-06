package series;

import java.util.Scanner;

/*
     Generar y desplegar los N números 
    que tengan la forma siguiente: 1, 0,1, 0, 1, 0,...
 */
public class Ej5UnosCeros {

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
                    System.out.println("Debe ingresar un numero entero");
                }
            } else {
                System.out.println("Debe ingresar un numero entero: ");
                sc.next();
            }
        }
        serieBinaria(numero);
    }

    public static void serieBinaria(int num) {
        int d = 1;
        StringBuilder resultado = new StringBuilder();
        //usando clase StringBuilder para concatenar mas eficientemente el resultado
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                resultado.append("1");
            } else {
                resultado.append("0");
            }
            if (i < num) {
                resultado.append(" , ");
            }
        }
        System.out.println(resultado.toString());
    }

}
