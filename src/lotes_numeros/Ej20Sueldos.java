package lotes_numeros;

/*Se tiene n números, que representan el sueldo 
de n personas, se pide mostrar la suma 
total de sueldos, el sueldo promedio, el sueldo 
mínimo y el sueldo máximo. */
import java.util.Scanner;

public class Ej20Sueldos {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        int[] salida = calculoSueldos(numero);
        System.out.println("El suma de sueldos es: " + salida[0]);
        System.out.println("El sueldo promedio es: " + salida[1]);
        System.out.println("El sueldo minimo es: " + salida[2]);
        System.out.println("El sueldo maximo es: " + salida[3]);
    }

    public static int[] calculoSueldos(int num) {
        Scanner sc = new Scanner(System.in);
        int[] salida = new int[4];
        int promedio = 0, c = 0, n, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        System.out.println("Ingrese los " + num + " sueldos: ");
        for (int i = 1; i <= num; i++) {
            c++;
            n = sc.nextInt();
            mayor = n > mayor ? n : mayor;
            menor = n < menor ? n : menor;
            promedio += n;
        }
        salida[0] = promedio;
        promedio /= c;
        salida[1] = promedio;
        salida[2] = menor;
        salida[3] = mayor;
        return salida;
    }
}
