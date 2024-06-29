/*Dado un numero X, invertir sus dígitos 
y desplegar el resultado. */
package descomposicion;

public class Ej3InvertirDigitos {

    public static void main(String[] args) {
        System.out.println("El numero invertido es: "+invertir());
    }

    //metodo limitado por el uso de int
    public static int invertir() {
        int num = MetodosUtiles.validacionNumero();
        int nuevo_numero = 0;
        while (num > 0) {
            nuevo_numero *= 10;
            nuevo_numero += num % 10;
            num /= 10;
        }
        return nuevo_numero;
    }
}
