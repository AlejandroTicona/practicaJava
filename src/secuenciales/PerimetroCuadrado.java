package secuenciales;


import java.util.Scanner;

public class PerimetroCuadrado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el tamano de lado de un cuadrado: ");
        float l = sc.nextFloat();
        float area = l*l;
        float perimetro = l * 4 ;
        System.out.println("El area del cuadrado es de: "+area+"\nEl perimtro del cuadrado es de: "+perimetro);
    }
}
