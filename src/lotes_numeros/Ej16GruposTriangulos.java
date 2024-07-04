package lotes_numeros;

import java.util.Scanner;

/*Dado un lote de n grupos de datos, 
cada grupo contiene tres datos que son los lados de 
un triángulo, se pide calcular el área, 
luego desplegar el área y los lados.*/
public class Ej16GruposTriangulos {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        gruposTriangulares(numero);
    }

    public static void gruposTriangulares(int num) {
        StringBuilder salida = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n;
        for (int i = 1; i <= num; i++) {
            System.out.println("GRUPO " + i);
            float semiperimetro = 0, a, b, c;
            float area = 0;
            System.out.println("Ingrese el lado a: ");
            a = sc.nextInt();
            System.out.println("Ingrese el lado b: ");
            b = sc.nextInt();
            System.out.println("Ingrese el lado c: ");
            c = sc.nextInt();
            semiperimetro = (float)(a + b + c) / (2);
            area = (float) (Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c)));
            salida.append("Grupo " + i + "\n");
            salida.append("Lado a: " + a + "\n");
            salida.append("Lado b: " + b + "\n");
            salida.append("Lado c: " + c + "\n");
            salida.append("Area: " + area + "\n\n********************");
        }
        System.out.println(salida);
    }
}
