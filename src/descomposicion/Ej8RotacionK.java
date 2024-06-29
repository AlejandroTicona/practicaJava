package descomposicion;

/*Dado un numero X, hacer rotar hacia la derecha 
    en K dígitos, desplegar el numero obtenido.
 */
public class Ej8RotacionK {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumeroMayorA10();
        int n = MetodosUtiles.validacionNumero();
        int resultado = rotacionEnK(numero, n);
        System.out.println("El numero " + numero + " rotado " + n + " veces hacia la derecha es \n: " + resultado);
    }

    private static int rotacionEnK(int numero, int n) {
        int nn = 0, cantidad_digitos = cantidadDigitos(numero), recorrido = 0;
        for (int i = 1; i <= n; i++) {
            recorrido = (int) ((numero % 10) * (Math.pow(10, cantidad_digitos-1)));
            numero = recorrido + (numero/10);
        }
        return numero;
    }

    //repetire esta funcion en cada ejercicio hasta que la comprenda al 100
    //luego la adicionare a MetodosUtiles.java
    private static int cantidadDigitos(int num) {
        return (int) (Math.floor(Math.log10(Math.abs(num)))) + 1;
        //Math.abs(numero) = devolvera el valor absoluto de numero
        //Math.log10(...) = Calculara el logaritmo en base 10 del valor absoluto del numero
        //Math.floor(...) = Redondea hacia abajo el resultante del logaritmo
        //+1 Suma 1 al funal para obtener el numero de digitos
    }
}
