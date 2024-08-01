package programacion_modular;

/*. Leer un número X entero y positivo y 
eliminar aquellos dígitos cuyo valor sea igual al 
menor de ellos.
Ejemplo: Entra X = 6753639 y A = 3
 Sale NX = 67569*/
public class Ej14EliminandoMenoresX {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionEntero();
        System.out.println(componiendoNuevoNumero(num));
    }

    public static int componiendoNuevoNumero(int num) {
        int menor = buscandoMenor(num), salida = 0, posicionMult = 1;
        while (num > 0) {
            if (num % 10 != menor) {
                salida += num % 10 * posicionMult;
                posicionMult *= 10;
            }
            num /= 10;
        }
        return salida;
    }

    public static int buscandoMenor(int num) {
        int menor = Integer.MAX_VALUE;
        while (num > 0) {
            if (num % 10 < menor) {
                menor = num % 10;
            }
            num /= 10;
        }
        return menor;
    }

}
