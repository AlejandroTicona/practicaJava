package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entradas {

    /*Se tiene la venta de entradas para un evento, 
    se considero realizar un porcentaje de 
    descuento en preventa, en los siguientes 
    sectores: Vip 35%, Platino 30% y General 
    20%, donde los costos por entrada son: vip 
    400 Bs, platino 300, general 200, 
    mostrar el costo final de pago.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VENTA DE ENTRADAS EN PREVENTA");
        int sector = 0;
        float precio = 0;
        try {
            System.out.println("Seleccione su sector: \n1.VIP\n2.PLATINO\n3.GENERAL");
            sector = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar solo numeros!");
            return;
        }

        switch (sector) {
            case 1:
                precio = (float) (400 * 0.65);
                break;
            case 2:
                precio = (float) (300 * 0.70);
                break;
            case 3:
                precio = (float) (200 * 0.80);
                break;
            default:
                System.out.println("Debe ingresar una opcion valida");
                break;
        }
        System.out.println("El precio final es de: " + precio);
    }
}
