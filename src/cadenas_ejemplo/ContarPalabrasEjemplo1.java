package cadenas_ejemplo;

import java.util.Scanner;

/*Ejemplos en base a tutoriales parar relacionarse mejor 
con el manejo de cadenas

Escribir un programa que lea una frase y a contninuacion visualice 
cada palabra de la frase una debajo de otra, seguida del numero
de letras que compone la palabra

se usara split("") = separa cadenas dependiendo de un parametro
el parametro sera el espacio vacio = " "

tambien se usara length()

es importante considerar el BUFFER de datos, investigar mas
 */
/**
 * Realizar el conteo de palabras de una frase y mostrar la cantidad de
 * caracteres que continene cada palabra
 *
 * @author Alejandro Ticona
 */
public class ContarPalabrasEjemplo1 {

    public static void contar(String frase) {
        String palabras[];
        //dividiendo la frase por el parametro de espacio
        palabras = frase.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra + " ---> " + palabra.length());
        }
    }

}
