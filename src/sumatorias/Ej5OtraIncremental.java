package sumatorias;

import java.util.Scanner;

/*S = 1 + 2 + 4 + 7 + 11 + 16 + …*/
public class Ej5OtraIncremental {

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
                    System.out.println("Debe ingresar un numero entero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println(sumatoriaIncremental(numero)); 
    }

    public static int sumatoriaIncremental(int num) {
        StringBuilder salida = new StringBuilder();
        int mostrar = 1, suma = 0;
        for (int i = 1; i <= num; i++) {
            salida.append(mostrar);
            suma =suma+mostrar ;
            mostrar = suma;
            if(i<num){
                salida.append(" + ");
            }
        }
        System.out.println(salida.toString());
        return suma;
    }
}
