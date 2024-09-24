package manejo_cadenas;

/**
 * Programa que elimina las vocales
 *
 * @author Alejandro Ticona
 */
public class Ej7EliminarVocales {

    public void eliminarVocales(String cadena) {
        StringBuilder salida = new StringBuilder();
        cadena = cadena.toLowerCase();
        int n = cadena.length();
        char c;
        for (int i = 0; i < n; i++) {
            c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            }else{
                salida.append(c);
            }
        }
        System.out.println(salida);
    }
}
