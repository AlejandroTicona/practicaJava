/*Aqui se desarrollaron metodos utiles como la validacion de n o demás,
cada metodo estara con su debida explicacion, me da hueva hacer la misma validacion para cada ejercicio*/
package descomposicion;

import java.util.Scanner;

public class MetodosUtiles {

    public static int validacionNumero() {
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
                    System.out.println("Debe ingresar un numero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        return numero;
    }

    public static int validacionNumeroDistinto() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero mayor a 0: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0 && !validacionIgual(numero)) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero mayor a 0 y con digitos distintos");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        return numero;
    }

    public static int validacionNumeroMayorA10() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero mayor a 10: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 10) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar un numero mayor a 10");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        return numero;
    }

    //aqui usaremos etiquetas para efectivizar las cosas no se si sea buena practica
    public static boolean validacionIgual(int num) {
        int aux = 0, r = num % 10;
        boolean isRepeat = false;
        while (num > 0) {
            aux = num / 10;
            while (aux > 0) {
                if (aux % 10 == num % 10) {
                    isRepeat = true;
                }
                aux /= 10;
            }
            num /= 10;
        }
        return isRepeat;
    }

    public static int cantidadDigitos(int num) {
        return (int) (Math.floor(Math.log10(Math.abs(num))) + 1);
    }

    public static int validacionOpc() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese una opcion: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0 && numero < 4) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ingresar una de las 3 opciones");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        return numero;
    }

}
