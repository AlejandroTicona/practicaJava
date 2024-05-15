package secuenciales;

import java.util.Scanner;

public class Inmobiliaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del metro cuadrado: ");
        float precio = sc.nextFloat();
        System.out.println("Ingrese el tamano del terreno en metros cuadrados: ");
        float tamano = sc.nextFloat();
        System.out.println("Ingrese el monto de la primera cuota a pagar");
        float ci = sc.nextFloat();
        float total_pagar = (float) ((tamano * precio) - ci) / 12;
        System.out.println("El monto a pagar en 12 comodas cuotas es de: " + total_pagar + "Bs.\n empezará cancelando el monto de " + ci);
    }
}
