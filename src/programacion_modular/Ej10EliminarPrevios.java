package programacion_modular;

/*Leer un número Z y eliminar todos sus dígito cuyo valor 
sea igual a otro número A previamente leído.
Ejemplo: Entra Z = 47647684 y A = 4
Sale Z = 76768
 */
public class Ej10EliminarPrevios {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero que sera elimado, debe tener solo un digito: ");
        int a = MetodosUtiles.validacionNumeroParametro(9);
        System.out.println("Ingrese el numero del que se eliminara " + a + " :");
        int z = MetodosUtiles.validacionEntero();
        System.out.println("El nuevo numero es: "+eliminarZ(z, a));
    }

    public static int eliminarZ(int z, int a) {
        int nn = 0, pot = 0;
        while (z > 0) {
            if (z % 10 != a) {
                nn += Math.pow(10, pot) * (z % 10);
                pot++;
            }
            z /= 10;
        }
        return nn;
    }
}
