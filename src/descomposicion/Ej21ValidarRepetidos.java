package descomposicion;

/*Introducir un numero entero positivo n 
con sus dígitos distintos entre si*/
public class Ej21ValidarRepetidos {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        if (distinguir(num)) {
            System.out.println("El numero tiene repetidos");
        } else {
            System.out.println("El numero no tiene repetidos");
        }
    }

    public static boolean distinguir(int num) {
        int aux = 0, r = 0;
        boolean isDistinct = false;
        while (num > 0) {
            aux = num / 10;
            r = num % 10;
            while (aux > 0) {
                if (r == aux % 10) {
                    isDistinct = true;
                }
                aux /= 10;
            }
            num /= 10;
        }
        return isDistinct;
    }
}
