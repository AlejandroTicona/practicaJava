package series;

import java.util.Scanner;

/*Generar los primeros numeros pares*/
public class Ej2PrimerosPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            System.out.println("Ingrese un numero entero positivo: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    isNumber = true;
                } else {
                    System.out.println("Debe ser un numero positivo");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }

        multiplos2(numero);
    }

    public static void multiplos2(int num) {
        for (int i = 1; i <= num; i++) {
            if(i==num){
                System.out.print(i*7+"\n");
            }else{
                System.out.print(i*7+" , ");
            }
        }
    }
}
