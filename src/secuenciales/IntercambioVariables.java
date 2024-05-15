package secuenciales;

import java.util.Scanner;

public class IntercambioVariables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa a: ");
        int a = sc.nextInt();
        System.out.println("Ingresa b: ");
        int b = sc.nextInt();
        a = a + b; //le sumamos la 2da variable a la primera
        b = a - b; //le restamos el valor de la 2da a la suma de 1ra y 2da
        a = a - b; //le restamos el valor de la 2da a la primera suma 
        System.out.println("El valor de a es : " + a + "\nEl valor de b es: " + b);
        /*lo voy a escribir nuevamente para no olvidarme el funcionamiento de esta mamada
        primero sumamos las 2 variables en a
        luego en b sumamos a que ahora es la suma de a y b y restamos b, asi solo nos quedaria como residuo el valor de a
        y al final a a restamos el nuevo valor de b que es a 
        
        mas corto y mejor
        sumamos en a a y b 
        en b sumamos a(a+b) y restamos el mismo valor de b
        en a agarramos a(a+b) y restamos b quedando asi el valor de a*/
    }
}
