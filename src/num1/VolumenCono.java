package num1;


import java.util.Scanner;

public class VolumenCono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radiocono, alturacono;
        System.out.println("Ingresa el radio del cono: ");
        radiocono = sc.nextFloat();
        System.out.println("Ingresa la altura del cono: ");
        alturacono = sc.nextFloat();
        float volumencono = (float) ((1.0f/3)*Math.PI*Math.pow(radiocono, 2)*alturacono);
        System.out.println("El volumen del cono es de: "+volumencono);
    }
}
