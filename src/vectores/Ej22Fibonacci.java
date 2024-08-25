package vectores;

/*Generar y desplegar un vector de N elementos que contenga 
los números de la serie de Fibonacci. */
public class Ej22Fibonacci {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector");
        int n = Validaciones.validacionEntero(0);
        int[] vector = fibonacci(n);
        mostrarVector(vector);

    }

    public static int[] fibonacci(int n) {
        int a = -1, b = 1, c = a+b;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            c = a + b;
            vector[i] = c;
            a = b;
            b = c;
        }
        return vector;
    }

    public static void mostrarVector(int[] vector) {
        StringBuilder salida = new StringBuilder();
        salida.append("[");
        for (int i = 0; i < vector.length; i++) {
            salida.append(vector[i]);
            if(i < vector.length - 1){
                salida.append(" , ");
            }
        }
        salida.append("]");
        System.out.println(salida);
    }
}
