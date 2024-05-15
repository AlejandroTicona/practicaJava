package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibreriaParra {

    /*En la Librería Parra las personas que van a pagar el importe 
    de su compra llegan a la caja y sacan de una caja un número que 
    les indicará el valor del descuento que tendrán sobre el total 
    de su compra. Tomar en cuenta lo siguiente: 
     Si el número es 1: Descuento 20% y no se le aplica el IVA. 
     Si el número es 2: Descuento 15% más IVA. 
     Si el número es 3: Descuento 18% y no se le aplica el IVA.
    Nota: Sólo hay 3 posibilidades de números en la caja. 
    Resuelva utilizando una estructura condicional múltiple.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        float monto = 0;
        try {
            System.out.println("Ingrese el importe de la compra: ");
            monto = sc.nextFloat();
            System.out.println("Ingrese el numero de descuento: ");
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar numeros");
            return;
        }
        switch (num) {
            case 1:
                monto = (float) (monto * 0.80);
                break;
            case 2:
                monto = (float) ((monto * 0.85) + ((monto * 0.85) * 0.13));
                break;
            case 3:
                monto = (float) (monto * 0.82);
                break;
            default:
                System.out.println("El numero de descuento no es valido");
                return;
        }
        System.out.println("El monto a pagar es de: " + monto);
    }
}
