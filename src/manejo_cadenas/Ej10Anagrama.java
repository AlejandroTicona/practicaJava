package manejo_cadenas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Dada dos palabras verificar si una es anagrama de la otra
 *
 * @author aleja
 */
public class Ej10Anagrama {

    public void anagrama() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra: ");
        String palabra1 = sc.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String palabra2 = sc.nextLine();
        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println(palabra1 + " y " + palabra2 + " son anagramas");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " no son anagramas");
        }
    }

    private boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] arregloPalabra1 = palabra1.toLowerCase().toCharArray();
        char[] arregloPalabra2 = palabra2.toLowerCase().toCharArray();

        Arrays.sort(arregloPalabra1);
        Arrays.sort(arregloPalabra2);

        return Arrays.equals(arregloPalabra1, arregloPalabra2);
    }
}
