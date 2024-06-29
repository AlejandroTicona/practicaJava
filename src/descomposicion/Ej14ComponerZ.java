package descomposicion;

public class Ej14ComponerZ {

    public static void main(String[] args) {
        boolean tienenDigitosIguales = false;
        int num1 = 0, num2 = 0;
        while (!tienenDigitosIguales) {
            System.out.println("Los numeros deben tener la misma cantidad de digitos: ");
            num1 = MetodosUtiles.validacionNumero();
            num2 = MetodosUtiles.validacionNumero();
            if (MetodosUtiles.cantidadDigitos(num1) == MetodosUtiles.cantidadDigitos(num2)) {
                tienenDigitosIguales = true;
            } else {
                System.out.println("Ambos numeros deben tener la misma cantidad de digitos");
            }
        }
        System.out.println("El nuevo numero compuesto es: " + componerZ(num1, num2));
    }

    public static int componerZ(int num1, int num2) {
        int r1 = 0, r2 = 0, nuevo_numero = 0, c = 0;
        while (num1 > 0 && num2 > 0) {
            r1 = (num1 % 10);
            r2 = (num2 % 10);
            if (r1 > r2) {
                nuevo_numero = (int) (nuevo_numero + (r2 * (Math.pow(10, c++))));
                nuevo_numero = (int) (nuevo_numero + (r1 * (Math.pow(10, c++))));
            } else {
                nuevo_numero = (int) (nuevo_numero + (r1 * (Math.pow(10, c++))));
                nuevo_numero = (int) (nuevo_numero + (r2 * (Math.pow(10, c++))));
            }
            num1 /= 10;
            num2 /= 10;
        }
        return nuevo_numero;
    }

}
