package manejo_cadenas;

import java.util.Scanner;

/*Realizar un programa que permita encontrar todas las apariciones de una subcadena 
dentro de otra.
la funcion indexOf devuelve la posicion de la busqueda de una
subcadena dentro de la otro, pero con un parametro int adicional
podemos especificar apartir de que indice deseamos realizar
la busqueda
*/
public class Ej1AparicionesSubCadena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Ingrese la subcadena a buscar: ");
        String subcadena = sc.nextLine();
        
        int index = 0;
        index = cadena.indexOf(subcadena, index);
        int count = 0;
        
        while (index != -1) {            
            System.out.println("Subcadena encontrana en el indice: "+index);
            index += subcadena.length();
            count++;
            index = cadena.indexOf(subcadena, index);
        }
    }
}
