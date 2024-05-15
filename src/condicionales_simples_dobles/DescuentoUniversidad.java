package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DescuentoUniversidad {

    /*El Director de la UTB desea implementar un programa de 
    descuento en la mensualidad de los estudiantes 
    universitarios de acuerdo al promedio obtenido en las 
    asignaturas que cursan, el cual consiste en lo siguiente: 
    si el promedio obtenido por un alumno en el último período 
    es mayor o igual que 80 se le hará un descuento del 25% 
    sobre la(s) mensualidad y no se le cobrará IVA; si el 
    promedio es menor que 80 deberá pagar la(s) mensualidad 
    completa más 15% de IVA. Calcular e imprimir cuanto debe 
    pagar un alumno.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float promedio = 0, monto_pagar, precio_mensualidad = 750;
        int cantidad_mensualidades = 0;
        try {
            System.out.println("Ingrese el promedio: ");
            promedio = sc.nextFloat();
            System.out.println("Ingrese la cantidad de mensualidades: ");
            cantidad_mensualidades = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar numeros validos");
            return;
        }

        if (promedio >= 80) {
            monto_pagar = (float) ((precio_mensualidad * cantidad_mensualidades) * 0.75);
        } else {
            monto_pagar = (float) ((precio_mensualidad * cantidad_mensualidades) * 1.25);
        }
        System.out.println("El monto a pagar es de: " + monto_pagar);
    }
}
