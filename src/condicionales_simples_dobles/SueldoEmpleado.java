package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SueldoEmpleado {

    /*Pedir el sueldo de un empleado y la antigüedad en la 
    empresa. Calcular el nuevo sueldo del empleado. 
    Sabiendo que a partir de tres años tendrá un incremento 
    del 3%, de cinco años tendrá un incremento del 6% y a 
    partir de los diez años tendrá un incremento del 
    10%. por ejemplo si el sueldo de un empleado es de 
    2500 Bs. y tiene 7 años trabajando en la empresa, 
    su sueldo con su incremento correspondiente será de 
    2650 Bs*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sueldo, sueldo_final = 0;
        int antiguedad;
        try {
            System.out.println("Ingrese su sueldo base: ");
            sueldo = sc.nextFloat();
            System.out.println("Ingrese su antiguedad: ");
            antiguedad = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar numeros validos");
            return;
        }

        if (antiguedad < 3) {
            sueldo_final = sueldo;
        } else if (antiguedad >= 3 && antiguedad < 5) {
            sueldo_final = (float) ((float) sueldo + (sueldo * 0.03));
        } else if (antiguedad >= 5 && antiguedad < 10) {
            sueldo_final = (float) ((float) sueldo + (sueldo * 0.06));
        } else if (antiguedad >= 10) {
            sueldo_final = ((float) ((float) sueldo + (sueldo * 0.10)));
        }
        System.out.println("El sueldo actual es de: " + sueldo_final);
    }
}
