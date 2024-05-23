package estructuras_repetitivas;

import java.util.Scanner;

/*Hallar el cubo de un número entero 
positivo n en base a suma de n números impares, 
consecutivos.*/
 /*1+3+5+7+...+(2m-1)=m^2*/
public class Ej14CuboSuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero: ");
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

        cuboSuma(numero);

    }

    public static void cuboSuma(int num) {
        int suma = 0;
        //calcular la suma de los primos (num-1) numeros
        for (int i = 1; i <= num - 1; i++) {
            suma = suma + i;
        }
        System.out.println("Suma de los primeros " + (num - 1) + "numeros: " + suma);
        //Inicializar el primer numero impar a sumar para calcular el cubo
        int imparInicial = 2 * suma + 1;

        //calculamos el cubo sumando los primeros 'num' numeros impares a partir de 'imparInicial'
        int cubo = 0 ;
        for (int i = 0; i < num; i++) {
            cubo = cubo+imparInicial+(i*2);
        }
        
        System.out.println("El cubo de "+num+" es: "+cubo);
        /*
        //PRIMERA SOLUCION, ME COSTO UN CHINGO
        int suma = 0;
        //sumando cantidad de digitos pasados para saber
        //que numero de impar empezar
        for (int i = 1; i <= num - 1; i++) {
            suma += i;
        }
        System.out.println("Suma" + suma);
        //calculando la cantidad de digitos que van por detras de num
        int acumulado = 0;
        for (int i = 1; i < num; i++) {
            acumulado = suma * 2 + 1;
        }
        //calculando la suma de los digitos para el cubo
        int cubo = 0;
        for (int i = 0; i < num; i++) {
            cubo = cubo + acumulado + (i * 2);
        }

        System.out.println("El cubo es: " + cubo);
         */
    }
}
