package manejo_cadenas;
/**
 * Programa que intercambia los espacios por *
 * @author aleja
 */
public class Ej9EspaciosPorAsterisco {
    public void intercambio(String cadena){
        StringBuilder salida = new StringBuilder();
        int n = cadena.length();
        for (int i = 0; i < n; i++) {
            char c = cadena.charAt(i);
            if(c == ' '){
                salida.append("*");
            }else{
                salida.append(c);
            }
        }
        System.out.println(salida);
    }
}
