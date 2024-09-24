package manejo_cadenas;

/*Escribe un programa que lea del teclado una cadena y muestre 
en la pantalla la cantidad de consonantes y de vocales que contiene. 
EMPEZAREMOS A UTILIZAR UNA CLASE MAIN Y REFERENCIAREMOS LOS EJERCICIOS
COMO OBJETOS PARA ACCEDER A LAS FUNCIONES*/
public class Ej2CantidadConsonantesVocales {

    public void cantidadConsonantesVocales(String cadena) {
        cadena = cadena.toLowerCase();
        int  consonantes = 0, vocales = 0;
        int n = cadena.length();
        char c;
        for (int i = 0; i < n; i++) {
            c = cadena.charAt(i);
            if(Character.isLetter(c)){
                if(esVocal(c)){
                    vocales++;
                }else{
                    consonantes++;
                }
            }
        }
        System.out.println("Consonantes: " + consonantes);
        System.out.println("Vocales: " + vocales);
    }
    
    private boolean esVocal(char c){
        return c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u';
    }
}
