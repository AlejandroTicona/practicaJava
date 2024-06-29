package descomposicion;

/*Dado un numero entero positivo n se desea saber: 
a. cuantos de sus dígitos son pares 
b. cuantos de sus dígitos son múltiplos de tres 
c. la suma de todos sus dígitos 
 */
public class Ej17ParesMultiplosSuma {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        System.out.println("OPCIONES\n1.Pares\n2.Multiplos de tres\n3.Suma de todos los digitos");
        int opc = MetodosUtiles.validacionOpc();
        switch (opc) {
            case 1:
                System.out.println("Hay " + contarPares(num) + " pares");
                break;
            case 2:
                System.out.println("Hay " + contarMultiplos3(num) + " multiplos de 3");
                break;
            case 3:
                System.out.println("La suma de los digitos es: " + sumaDigitos(num));
                break;
            default:
                System.out.println("Error");
        }
    }

    private static int contarPares(int num) {
        int c = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                c++;
            }
            num /= 10;
        }
        return c;
    }

    private static int contarMultiplos3(int num) {
        int c = 0;
        while (num > 0) {
            if ((num % 10) % 3 == 0) {
                c++;
            }
            num /= 10;
        }
        return c;
    }

    private static int sumaDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}
