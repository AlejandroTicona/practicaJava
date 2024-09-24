package cadenas_ejemplo;

import java.util.Scanner;

/*Escribir un programa que lea por teclado una cadena
y muestre en la pantalla otra cadena en la que cada
vocal haya sido reemplazada por un punto*/
public class ReemplazoVocalesEjemplo {

    /**
     * *
     * reemplazar las vocales por un punto utilizando replace()
     *
     * @param cad, es la cadena de entrada
     *
     *
     */
    public  void reemplazarReplace(String cad) {
        String cad1, cad2, cad3, cad4, cad5;
        cad1 = cad.replace('a', '.');
        System.out.println(cad1);
        cad2 = cad1.replace('e', '.');
        System.out.println(cad2);
        cad3 = cad2.replace('i', '.');
        System.out.println(cad3);
        cad4 = cad3.replace('o', '.');
        System.out.println(cad4);
        cad5 = cad4.replace('u', '.');
        System.out.println("Cadena final: \t"+cad5);
    }

    public  void reemplazar(String cad) {
        int i, n;
        String cadAux = "";
        char car;
        n = cad.length();
        for (i = 0; i < n; i++) {
            car = cad.charAt(i);
            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
                cadAux += ".";
            } else {
                cadAux += car;
            }
        }
        System.out.println("Cadena final: " + cadAux);
    }


}
