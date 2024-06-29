package descomposicion;

/*sabes si un numero se lee igual de
    izquierda a derecha y de derecha a izquierda*/
public class Ej20Capicua {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        if(capicua(num)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }

    public static boolean capicua(int num) {
        int numero = num;
        boolean isCapicua = false;
        int nuevo_numero = 0;
        while (num > 0) {
            nuevo_numero = (nuevo_numero * 10) + (num % 10);
            num /= 10;
        }
        return numero == nuevo_numero;
    }
}
