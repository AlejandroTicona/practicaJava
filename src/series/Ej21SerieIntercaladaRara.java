package series;

import java.util.Scanner;

/*1, 3, 2, 4, 5, 7, 6, 9, 11, 10, 12, …*/
public class Ej21SerieIntercaladaRara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero mayor a 0: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }

        }
        serieIntercalada(number);
    }

    public static void serieIntercalada(int num) {
        StringBuilder salida = new StringBuilder();
        int cs = 1, s = 1, sp = 0, impar = 1, par = 2, mostrar = impar, cpar = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(mostrar);
            if (s % 2 == 1) {
                if (cs != 2) {
                    cs++;
                    impar += 2;
                    mostrar = impar;
                } else {
                    cs = 1;
                    impar += 2;
                    mostrar = par;
                    s++;
                    sp++;
                }
            } else {
                if (sp % 2 == 0) {
                    cs = 1;
                    par = par + (cpar * 2);
                    cpar++;
                    mostrar = impar;
                    s++;
                } else {
                    if (cs != 2) {
                        cs++;
                        par = par + 2;
                        mostrar = par;
                    } else {
                        cs = 1;
                        par = par + (cpar * 2);
                        mostrar = impar;
                        s++;
                        cpar++;
                    }
                }
            }
            if (i < num) {
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }

}
