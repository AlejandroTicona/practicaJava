package lotes_numeros;

import java.util.Scanner;

/*Leer un lote de N números con N >= 3, 
hallar el promedio de cada 3 números leídos 
consecutivamente y desplegar cada promedio.*/
public class Ej7PromedioCada3Numeros {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero3();
        promedios3(numero);

    }

    public static void promedios3(int num) {
        Scanner sc = new Scanner(System.in);
        StringBuilder salida = new StringBuilder();
        int n = 0, s = 0, c = 0;
        System.out.println("Ingrese los " + num + " digitos");
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            s += n;
            c++;
            if (c == 3) {
                salida.append(s+" , ");
                s = 0;
                c = 0;
            }
        }
        System.out.println(salida);
    }

}
