package manejo_cadenas;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa para adivinar palabras
 *
 * @author Alejandro Ticona
 */
public class Ej5Adivinar {

    public void juego() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String entrada;
        String[] palabrasArray;

        while (true) {
            System.out.println("Ingrese una lista de palabras separadas por espacio, deben ser menos de 10: ");
            entrada = sc.nextLine();
            palabrasArray = entrada.split(" ");

            if (palabrasArray.length <= 10) {
                break;
            } else {
                System.out.println("La lista debe conter 10 o menos palabras");
            }

        }
        int fallos = 0;
        String palabraElegida = palabrasArray[random.nextInt(palabrasArray.length)];
        System.out.println("PISTAS");
        for (int i = 0; i < 4; i++) {
            String letra = esLetra();
            if (palabraElegida.indexOf(letra) != -1) {
                System.out.println("La letra " + letra + " se encuentra en la posicion " + palabraElegida.indexOf(letra));
            } else {
                System.out.println("La letra " + letra + " no se encuentra en la palabra");
            }
        }
        System.out.println("Ingrese la palabra");
        while (fallos <= 8) {
            String palabra = sc.nextLine();
            if(palabra.equals(palabraElegida)){
                System.out.println("CORRECTO!!! USTED GANO");
                break;
            }else{
                System.out.println("Incorrecto, tienes "+(7-fallos)+" intentos adicionales");
                fallos++;
            }
        }
        if(fallos == 8){
            System.out.println("USTED PERDIO");
        }
    }

    public String esLetra() {
        Scanner sc = new Scanner(System.in);
        String letra;
        while (true) {
            letra = sc.nextLine();
            if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) {
                break;
            } else {
                System.out.println("Error debe ingresar exactamente una letra");
            }
        }
        return letra;
    }
}
