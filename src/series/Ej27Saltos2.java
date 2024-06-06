package series;

import java.util.Scanner;

/*1, 2, 3, 2, 3, 4, 3, 4, 5, 4, 5, 6, 5, ..*/
public class Ej27Saltos2 {

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
                    System.out.println("Ingrese un numero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        saltos2Tres(numero);
    }

    public static void saltos2Tres(int num) {
        StringBuilder salida = new StringBuilder();
        int cs1 = 2, cs2 = 1, sw = 0, num1 = 2, num2 = 3, mostrar = num1;
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                salida.append("1");
            } else {
                salida.append(mostrar);
                if (sw == 0) {
                    if (cs1 == 3) {
                        cs1 = 1;
                        num1 += 2;
                    } else {
                        cs1++;
                    }
                    sw = 1;
                    mostrar = num2;
                } else {
                    if (cs2 == 3) {
                        cs2 = 1;
                        num2 += 2;
                    } else {
                        cs2++;
                    }
                    mostrar = num1;
                    sw = 0;
                }
            }
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
//no sé como resolví esto, estaba bastante somnoliento y desanimado 
