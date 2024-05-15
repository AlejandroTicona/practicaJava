package secuenciales;


import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo: ");
        float radio = sc.nextFloat();
        float areac = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("El radio del circulo es de: "+areac);
    }
}
