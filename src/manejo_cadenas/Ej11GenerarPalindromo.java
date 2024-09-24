package manejo_cadenas;

/**
 * Programa que aumenta palabras a una cadena para volvera palindromo
 *
 * @author Alejandro Ticona
 */
public class Ej11GenerarPalindromo {

    public void generacion(String cadena) {
        StringBuilder salida = new StringBuilder();
        int n = cadena.length();
        char c;
        salida.append(cadena);
        for (int i = n - 1; i >= 0; i--) {
            c = cadena.charAt(i);
            salida.append(c);
        }
        System.out.println("Nueva cadena: " + salida);
    }
}
