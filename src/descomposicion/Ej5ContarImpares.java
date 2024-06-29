package descomposicion;

/*Dado un numero n entero positivo ,
contar el número de dígitos impares que este 
contiene*/
public class Ej5ContarImpares {

    public static void main(String[] args) {
        System.out.println("Hay "+contarImpares()+" impares");
    }

    public static int contarImpares() {
        int num = MetodosUtiles.validacionNumero(), c = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 1) {
                c++;
                System.out.println((num % 10) + " es impar");
            }
            num /= 10;
        }
        return c;
    }
}
