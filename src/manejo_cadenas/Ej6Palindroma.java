package manejo_cadenas;

/**
 * Programa que dicta si una palabra es palindroma o no
 *
 * @author Alejandro Ticona
 */
public class Ej6Palindroma {

    public void esPalindroma(String cadena) {
        int n = cadena.length();
        String nuevaCadena = "";
        for (int i = n - 1; i >= 0; i--) {
            nuevaCadena += cadena.charAt(i);
        }
        if (nuevaCadena.equalsIgnoreCase(cadena)) {
            System.out.println("Es palindroma");
        } else {
            System.out.println("No es palindroma");
        }
    }
}
