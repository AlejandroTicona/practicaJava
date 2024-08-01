package programacion_modular;

import java.util.Scanner;

/*La función mayor, que toma tres enteros x, y y z, y 
devuelva el entero mayor.
 */
public class Ej1MayorDe3 {

    public static void main(String[] args) {
        int x = MetodosUtiles.validacionEntero();
        int y = MetodosUtiles.validacionEntero();
        int z = MetodosUtiles.validacionEntero();
        System.out.println(mayor(x, y, z));
    }

    public static int mayor(int x, int y, int z) {
        int max = x > y ? (x > z ? x : z) : (z > y ? z : y);
        return max;
    }
}
