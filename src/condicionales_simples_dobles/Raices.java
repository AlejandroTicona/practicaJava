package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Raices {

    /*Calcular la raíz cuadrada de un número n; Si n es positivo visualizar el resultado y si es 
    negativo es visualizar un mensaje de RAIZ IMAGINARIA y visualizar el valor.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el valor de n: ");
        float n = 0, r;
        try {
            n = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un numero");
            return;
        }
        if (n != 0) {
            if (n > 0) {
                r = (float) Math.sqrt(n);
                System.out.println("Resultado: " + r);
            } else {
                float parteReal = 0;
                float parteImaginaria = (float) Math.sqrt(Math.abs(n));
                System.out.println("RAIZ IMAGINARIA: " + parteReal + " + " + parteImaginaria + "i");
            }
        } else {
            System.out.println("Debes ingresar un valor distinto a 0");
        }

    }
}
/*no soy bueno en matematicas seguire investigando el funcionamienot de los numeros imaginarios*/
