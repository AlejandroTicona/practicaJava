package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TablaMultiplicar {

    //ATENCION: ESTE EJERCICIO NO TIENE SENTIDO XD
    /*Dado un número del 1 al 9 mostrar la tabla de 
    multiplicar de dicho número del 1 al 9*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese un numero del 1 al 9: ");
        try {
            numero = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero entre 1 y 9");
            return;
        }
        if (numero < 0 || numero > 9) {
            System.out.println("Debe ser un numero entre 1 y 9");
            return;
        }

        //jaja esta mierda no tiene sentido jajajaja, ni modo debia acelerar las cosas
        switch (numero) {
            case 1:
                multiplicar(numero);
                return;
            case 2:
                multiplicar(numero);
                return;
            case 3:
                multiplicar(numero);
                return;
            case 4:
                multiplicar(numero);
                return;
            case 5:
                multiplicar(numero);
                return;
            case 6:
                multiplicar(numero);
                return;
            case 7:
                multiplicar(numero);
                return;
            case 8:
                multiplicar(numero);
                return;
            case 9:
                multiplicar(numero);
                return;
        }

    }

    //aqui usare una funcion no era la idea de la practica pero quiero llegar a vectores
    public static void multiplicar(int num) {
        System.out.println("1 * " + num + " = " + 1 * num);
        System.out.println("2 * " + num + " = " + 2 * num);
        System.out.println("3 * " + num + " = " + 3 * num);
        System.out.println("4 * " + num + " = " + 4 * num);
        System.out.println("5 * " + num + " = " + 5 * num);
        System.out.println("6 * " + num + " = " + 6 * num);
        System.out.println("7 * " + num + " = " + 7 * num);
        System.out.println("8 * " + num + " = " + 8 * num);
        System.out.println("9 * " + num + " = " + 9 * num);
        System.out.println("10 * " + num + " = " + 10 * num);

    }
}
