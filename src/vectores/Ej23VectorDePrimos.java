package vectores;

/*Generar y desplegar un vector de N elementos 
que contenga los números primos.*/
public class Ej23VectorDePrimos {

    public static void main(String[] args) {
        System.out.println("Digite la cantidad de numeros primos a mostrar: ");
        int n = Validaciones.validacionEntero(0);
        mostrarPrimos(vectorPrimos(n));
    }

    public static int[] vectorPrimos(int num) {
        int[] vector = new int[num];
        int i = 0, c = 0;
        while (i < num) {
            if (esPrimo(c)) {
                vector[i] = c;
                c++;
                i++;
            } else {
                c++;
            }
        }
        
        return vector;
    }

    public static boolean esPrimo(int num) {
        if (num == 1 || num == 0) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void mostrarPrimos(int[] vector){
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
