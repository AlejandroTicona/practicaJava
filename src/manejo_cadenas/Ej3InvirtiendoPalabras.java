package manejo_cadenas;
/*Dado una frase, invertir cada palabra de la frase. 
Ejemplo  Entrada frase= manejo de cadenas en java 
Salida:   frase=ojenam ed sanedac ne avaj */
public class Ej3InvirtiendoPalabras {
    public void invirtiendoPalabras(String frase){
        //separaremos las palabras del String - frase
        String palabras[];
        palabras = frase.split(" ");
        StringBuilder nuevaFrase = new StringBuilder(); 
        
        for (String p : palabras) {
            nuevaFrase.append(invertirPalabra(p)).append(" ");
        }
        System.out.println(nuevaFrase.toString().trim());
    }
    
    private String invertirPalabra(String palabra){
        int n = palabra.length();
        String nueva_palabra = "";
        for (int i = n - 1; i >= 0; i--) {
            nueva_palabra += palabra.charAt(i);
        }
        return nueva_palabra;
        //return new StringBuilder(palabra).reverse().toString();
    }
}
