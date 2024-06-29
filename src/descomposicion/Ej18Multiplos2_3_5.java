package descomposicion;

/*Dado un numero entero positivo n contar cuantos de 
sus dígitos son múltiplos de 2, 3 y 
5 */
public class Ej18Multiplos2_3_5 {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        contandoDigitos(num);
    }

    public static void contandoDigitos(int num) {
        int digitos2 = 0, digitos3 = 0, digitos5 = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                digitos2++;
            }
            if ((num % 10) % 3 == 0) {
                digitos3++;
            }
            if ((num % 10) % 5 == 0) {
                digitos5++;
            }
            num /= 10;
        }
        System.out.println("Hay\n" + digitos2 + " multiplos de 2\n" + digitos3 + " multiplos de 3\n" + digitos5 + " multiplos de 5");
    }
}
