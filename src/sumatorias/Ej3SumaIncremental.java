package sumatorias;

import java.util.Scanner;

/*S = 1 + 3 + 6 + 10 + 15+ …*/
public class Ej3SumaIncremental {

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
                    System.out.println("Debe ingresar un numero mayor a 0");
                }
            } else {
                System.out.println("Debe ingresar un numero entero");
                sc.next();
            }
        }
        System.out.println("El resultado es: "+sumaIncremental(numero));
        
    }
    
    public static int sumaIncremental(int num){
        StringBuilder salida = new StringBuilder();
        int mostrar = 1, suma = 0;
        for (int i = 2; i <= num+1; i++) {
            salida.append(mostrar);
            suma = suma + mostrar;
            mostrar = mostrar + i;
            if(i<= num){
                salida.append(" + ");
            }
        }
        System.out.println(salida.toString());
        return suma ;
    }
}
