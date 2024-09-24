package manejo_cadenas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ej2CantidadConsonantesVocales ej2 = new Ej2CantidadConsonantesVocales();
        Ej3InvirtiendoPalabras ej3 = new Ej3InvirtiendoPalabras();
        Ej4IntercambiandoVocalesPunto ej4 = new Ej4IntercambiandoVocalesPunto();
        Ej5Adivinar ej5 = new Ej5Adivinar();
        Ej6Palindroma ej6 = new Ej6Palindroma();
        Ej7EliminarVocales ej7 = new Ej7EliminarVocales();
        Ej8ContandoMayusculasMinusculasNumeros ej8 = new Ej8ContandoMayusculasMinusculasNumeros();
        Ej9EspaciosPorAsterisco ej9 = new Ej9EspaciosPorAsterisco();
        Ej10Anagrama ej10 = new Ej10Anagrama();
        Ej11GenerarPalindromo ej11 = new Ej11GenerarPalindromo();
        System.out.println("Ingrese una frase o palabra ");
        String cadena = sc.nextLine();
//        System.out.println("EJERCICIO 2 BUSQUEDA DE CONSONANTES - VOCALES");
//        ej2.cantidadConsonantesVocales(cadena);
//        System.out.println("EJERCICIO 3 INVERTIR PALABRA");
//        ej3.invirtiendoPalabras(cadena);
//        System.out.println("EJERCICIO 4 VOCAL - PUNTO");
//        ej4.reemplazar2(cadena);
//        ej5.juego();
//        ej6.esPalindroma(cadena);
//        ej7.eliminarVocales(cadena);
//        ej8.contando(cadena);
//        ej9.intercambio(cadena);
//        ej10.anagrama();
        ej11.generacion(cadena);
    }
}
