package descomposicion;

/* Dado un numero entero positivo contar los dígitos 
diferentes de cero que contenga*/
public class Ej16DiferentesCero {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        System.out.println("Existen " + contadoDistinto0(num) + " numeros distintos a 0");
    }

    public static int contadoDistinto0(int num) {
        int c = 0;
        while (num > 0) {
            if (num % 10 != 0) {
                c++;
            }
            num /= 10;
        }
        return c;
    }
}
