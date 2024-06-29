package descomposicion;

public class Ej23MenorDigito {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumeroDistinto();
        System.out.println("La posicion es: "+menorPosicion(num));
    }

    private static int menorPosicion(int num) {
        int menor = num % 10, c = 1, pos = 0;
        while (num > 0) {
            if (menor > num % 10) {
                menor = num % 10;
                pos = c;
            }
            c++;
            num /= 10;
        }

        System.out.println("El menor numero es: "+menor);
        return pos;
    }
}
