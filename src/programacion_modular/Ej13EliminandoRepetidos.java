package programacion_modular;

/* Dado un numero entero y positivo, 
eliminar todos aquellos dígitos 
repetidos y mostrar el numero resultante.
Ejemplo Si num=584266421
Salida num=584261*/
public class Ej13EliminandoRepetidos {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionEntero();
        System.out.println(eliminandoRepetidos(num));
    }

    /**
     * El método elimina los dígitos repetidos del número
     *
     * @param num el número del cual eliminar los dígitos repetidos
     * @return el número sin dígitos repetidos
     */
    public static int eliminandoRepetidos(int num) {
        int result = 0;
        int positionMultiplier = 1;

        while (num > 0) {
            int digit = num % 10;
            if (!hasDigit(result, digit)) {
                result += digit * positionMultiplier;
                positionMultiplier *= 10;
            }
            num /= 10;
        }

        return result;
    }

    /**
     * Método auxiliar que verifica si un número contiene un dígito específico
     *
     * @param num el número en el que buscar el dígito
     * @param digit el dígito que se quiere encontrar
     * @return true si el número contiene el dígito, false de lo contrario
     */
    public static boolean hasDigit(int num, int digit) {
        while (num > 0) {
            if (num % 10 == digit) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
