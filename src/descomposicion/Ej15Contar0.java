package descomposicion;
/*Dado un numero n positivo entero, 
determinar la cantidad de dígitos cero que contenga.*/
public class Ej15Contar0 {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        System.out.println("Existen " + contandoCeros(num) + " ceros");
    }

    public static int contandoCeros(int num) {
        int c = 0;
        while (num > 0) {
            if (num % 10 == 0) {
                c++;
            }
            num /= 10;
        }
        return c;
    }
}
