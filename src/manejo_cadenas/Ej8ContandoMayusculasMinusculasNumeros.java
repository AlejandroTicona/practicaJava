package manejo_cadenas;

/**
 * Programa que cuenta el numero de minúsculas, mayúsculas y la cantidad de
 * números
 *
 * @author Alejandro Ticona
 */
public class Ej8ContandoMayusculasMinusculasNumeros {

    public void contando(String cadena) {
        int contador_mayusculas = 0;
        int contador_minusculas = 0;
        int contador_numeros = 0;
        int n = cadena.length();
        int ascii;
        for (int i = 0; i < n; i++) {
            ascii = (int) cadena.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                contador_mayusculas++;
            } else if (ascii >= 97 && ascii <= 122) {
                contador_minusculas++;
            } else if (ascii >= 48 && ascii <= 57) {
                contador_numeros++;
            }
        }
        System.out.println("Mayusculas: " + contador_mayusculas);
        System.out.println("Minusculas: " + contador_minusculas);
        System.out.println("Numeros: " + contador_numeros);

    }
}
