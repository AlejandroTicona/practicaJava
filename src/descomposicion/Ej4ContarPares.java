package descomposicion;

/*Dado un numero entero positivo n contar 
el número de dígitos pares que este contiene*/
public class Ej4ContarPares {

    public static void main(String[] args) {
        System.out.println("Contiene "+contarPares()+ " pares");
    }

    public static int contarPares() {
        int num = MetodosUtiles.validacionNumero();
        int c = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                c++;
                System.out.println("El numero " + (num % 10) + " es par ");
            }
            num /= 10;
        }
        return c;
    }
}
