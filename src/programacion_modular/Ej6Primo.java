package programacion_modular;

/*Se dice que un entero es primo si puede dividirse 
solamente por 1 y por sí mismo. 
a) Escriba una función que determine si un número es primo.
b) Dado un número N mostrar todos los números primos que 
están antes de dicho número.
 */
public class Ej6Primo {

    public static void main(String[] args) {
        System.out.println("Ingrese los n digitos a ingresar: ");
        int n = MetodosUtiles.validacionEntero();
        System.out.println(listaPrimos(n));

    }

    public static boolean primo(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String listaPrimos(int num) {
        String salida = "";
        for (int i = 1; i <= num; i++) {
            if (primo(i)) {
                salida = salida + i + " , ";
            }
        }
        return salida;
    }
}
