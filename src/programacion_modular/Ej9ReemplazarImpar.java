package programacion_modular;

/*Dado un número NUM entero positivo reemplazar los dígitos 
impares que tuviera por el dígito par superior 
(en el caso del 9 reemplazar por 0).
Ejemplo: Entra NUM = 29652148
 Sale NNUM = 20662248
 */
public class Ej9ReemplazarImpar {
    
    public static void main(String[] args) {
        int num = MetodosUtiles.validacionEntero();
        System.out.println(componer(num));
    }
    
    public static int componer(int num) {
        int nn = 0, pot = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                nn = (int) ((Math.pow(10, pot) * reemplazar(num % 10)) + nn);
            } else {
                nn = (int) ((Math.pow(10, pot) * (num % 10)) + nn);
            }
            pot++;
            num /= 10;
        }
        return nn;
    }
    
    public static int reemplazar(int num) {
        if (num == 9) {
            return 0;
        } else {
            return (num + 1);
        }
    }
    
}
