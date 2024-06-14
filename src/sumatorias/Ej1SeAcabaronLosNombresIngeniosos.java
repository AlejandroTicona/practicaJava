package sumatorias;

import java.util.Scanner;

/*Hallar la suma de los primeros 5 números impares. 
  Desplegar el resultado. */
public class Ej1SeAcabaronLosNombresIngeniosos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(noPuedoDejarDeUsarMetodos(7));
        sc.close();
    }
    
    public static int noPuedoDejarDeUsarMetodos(int num){
        int suma = 0;
        for (int i = 1; i < num*2; i+=2) {
            suma = suma + i;
        }
        return suma;
    }
}
