package descomposicion;

/*Dado un numero entero positivo X, componer dos nuevos 
números uno que contenga los dígitos pares y el otro 
los impares. 
Ejemplo si el número es 69723 se muestra 62 y 973. */
public class Ej9ComponerPositivosNegativos {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        System.out.println("Los impares son: " + componer(numero, 1));
        System.out.println("Los pares son: " + componer(numero, 0));
    }

    public static int componer(int num, int tipo) {
        int nuevo_numero = 0, exp = 0;
        while (num > 0) {
            if (((num % 10) % 2) == tipo) {
                nuevo_numero += (num % 10) * ((Math.pow(10, exp)));
                exp++;
            }
            num /= 10;
        }
        return nuevo_numero;

    }
}
