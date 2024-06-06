package series;

import java.util.Scanner;

/*1, 4, 13, 40, 121, 364, …*/
public class Ej24DeAquiEnAdelantePuraPincheSerieRara {

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
                    System.out.println("Debe ingresar un numero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        aPartirDeAquiLesPondreNombresAdecuadosALosMetodos(numero);
    }

    public static void aPartirDeAquiLesPondreNombresAdecuadosALosMetodos(int num) {
        StringBuilder salida = new StringBuilder();
        int c = 1;
        for (int i = 1; i <= num; i++) {
            salida.append(c);
            c = (int) (c + (Math.pow(3, i)));
            if(i < num){
                salida.append(" , ");
            }
        }
        System.out.println(salida.toString());
    }
}
