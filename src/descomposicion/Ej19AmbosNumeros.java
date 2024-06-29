package descomposicion;

public class Ej19AmbosNumeros {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        System.out.println("n = " + num + "     m = " + invirtiendoNumero(num));
    }

    public static int invirtiendoNumero(int num) {
        int nuevo_numero = 0, c = 0;
        while (num > 0) {
            nuevo_numero *= 10;
            nuevo_numero += (num % 10);
            num /= 10;
        }
        return nuevo_numero;
    }
}
