package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Descuentos {

    /*Programa de descuentos en base a sexo y tarjeta obreo o empleado*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sexo = 0, tarjeta = 0;
        float monto = 0;
        try {
            System.out.println("DESCUENTOS DE EMPRESA: ");
            System.out.println("Ingrese su genero: \n1.MASCULINO\n2.FEMENINO");
            sexo = sc.nextInt();
            System.out.println("Ingrese su tarjeta: \n1.OBRERO\n2.EMPLEADO");
            tarjeta = sc.nextInt();
            System.out.println("Ingrese el monto: ");
            monto = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Los datos ingresados no son validos");
        }

        if (tarjeta > 0 && tarjeta < 3 && sexo > 0 && sexo < 3) {
            switch (sexo) {
                case 1:
                    if (tarjeta == 1) {
                        monto = (float) (monto * 0.85);
                    } else {
                        monto = (float) (monto * 0.80);
                    }
                    break;
                case 2:
                    if (tarjeta == 1) {
                        monto = (float) (monto * 0.90);
                    } else {
                        monto = (float) (monto * 0.87);
                    }
                    break;
            }
        } else {
            System.out.println("Las opciones ingresadas no son validas");
        }

        System.out.println("El monto a pagar es de :" + monto);
    }
}
