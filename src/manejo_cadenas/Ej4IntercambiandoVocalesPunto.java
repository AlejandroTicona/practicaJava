package manejo_cadenas;

/**
 * Programa que cambia cada vocal por un punto
 */
public class Ej4IntercambiandoVocalesPunto {

    public void reemplazar(String cadena) {
        //manera 1
        StringBuilder nueva_cadena = new StringBuilder();
        int n = cadena.length();
        char c;
        for (int i = 0; i < n; i++) {
            c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                nueva_cadena.append('.');
            } else {
                nueva_cadena.append(c);
            }
        }
        System.out.println(nueva_cadena);
    }

    public void reemplazar2(String cadena) {
        String cad2,cad3,cad4,cad5,cad6;
        cad2 = cadena.replace('a', '.');
        cad3 = cad2.replace('e', '.');
        cad4 = cad3.replace('i', '.');
        cad5 = cad4.replace('o', '.');
        cad6 = cad5.replace('u','.');
        System.out.println(cad6);
    }
}
