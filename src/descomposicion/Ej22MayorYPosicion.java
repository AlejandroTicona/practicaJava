package descomposicion;

/*Dado un número entero positivo n con los 
dígitos diferentes entre sí, se pide determinar 
el mayor digito que este contiene y la posición 
que ocupa contando de derecha a 
izquierda.*/
public class Ej22MayorYPosicion {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumeroDistinto();
        System.out.println(MetodosUtiles.validacionNumeroDistinto());
        System.out.println("La posicion es: " + mayorPosicion(num));
    }

    public static int mayorPosicion(int num) {
        int mayor = -1, pos = 0, c = 1;
        while (num > 0) {
            if ((num % 10) > mayor) {
                mayor = num % 10;
                pos = c;
            }
            c++;
            num /= 10;
        }
        System.out.println("El mayor digito es :" + mayor);
        return pos;
    }
}
