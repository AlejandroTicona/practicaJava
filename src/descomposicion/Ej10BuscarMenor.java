package descomposicion;

/*Pedir un número entero positivo, mostrar el digito menor 
y la posición que este ocupa contando de derecha a izquierda. 
Ejemplo si el número es 5247 se muestra 2 y su 
posición es 3*/
public class Ej10BuscarMenor {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        System.out.println("El menor digito en el numero: "+numero+"\nesta en la posicion :"+buscarMenor(numero));
    }

    public static int buscarMenor(int num) {
        int menor = (num % 10), contador = 1, posicion = 1;
        while (num > 0) {
            if ((num % 10) < menor) {
                menor = (num % 10);
                posicion = contador;
            }
            contador++;
            num /= 10;
        }
        System.out.println("El menor es: "+menor);
        return posicion;
    }

}
