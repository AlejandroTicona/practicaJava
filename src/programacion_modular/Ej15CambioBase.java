package programacion_modular;

/*Dado un número X en base 10 convertir a otra base B (2, 3, 4, 5, 6, 7, 8,9). Desplegar el 
número y su equivalente en base B*/
public class Ej15CambioBase {

    public static void main(String[] args) {
        System.out.println("INGRESA EL NUMERO");
        int num = MetodosUtiles.validacionEntero();
        System.out.println("INGRESA LA BASE A CONVERTIR ");
        int base = MetodosUtiles.validacionEntero();
        System.out.println(cambiandoBase(num, base));
    }

    public static int cambiandoBase(int num, int base) {
        int resultado = 0;
        int positionMultiplier = 1;

        while (num > 0) {
            int residuo = num % base;
            resultado += residuo * positionMultiplier;
            positionMultiplier *= 10;
            num /= base;
        }
        return resultado;

    }
}
