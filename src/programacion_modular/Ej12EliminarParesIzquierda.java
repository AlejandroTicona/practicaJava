package programacion_modular;

/*Dado un número Z entero y positivo, eliminar aquellos 
dígitos que se encuentren en las posiciones pares de 
izquierda a derecha. Mostrar el número resultante.
Ejemplo: Dado Z = 47647
 Sale NZ = 467*/
public class Ej12EliminarParesIzquierda {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionEntero();
        System.out.println(eliminandoParesALaIzquierda(num));
    }

    public static int invertir(int num) {
        int nn = 0;
        while (num > 0) {
            nn *= 10;
            nn += num % 10;
            num /= 10;
        }
        return nn;
    }

    public static int eliminandoParesALaIzquierda(int num) {
        num = invertir(num);
        boolean sw = false;
        int nn = 0;
        while (num > 0) {
            if (sw == false) {
                nn *= 10;
                nn += num % 10;
                sw = true;
            } else {
                sw = false;
            }
            num /= 10;
        }
        return nn;
    }
}
