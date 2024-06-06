package series;

import java.util.Scanner;

/*-2,3,4,6,7,8,12,13,14,20,21,…..*/
 /*Esto me costo mucho de entender, por creerme matematico jajaja*/
public class Ej19SerieRarisima {

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

        serieSufrida(numero);
    }

    public static void serieSufrida(int num) {
        StringBuilder salida = new StringBuilder();
        int mostrar = -2, c = 2, espacio = 2, paso = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(mostrar);
            if (paso == 3) {
                paso = 1;
                c += espacio;
                espacio += 2;
                mostrar = c;
            } else {
                paso++;
                c++;
                mostrar = c;
            }

            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }

}
