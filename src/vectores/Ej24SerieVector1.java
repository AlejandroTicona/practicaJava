package vectores;

/*1 4 9 16 25 36 49 64 81 100*/
public class Ej24SerieVector1 {

    public static void main(String[] args) {
        System.out.println("Ingresa la dimension del vector: ");
        int dimension = Validaciones.validacionEntero(0);
        mostrarVector(serie(dimension));
    }

    public static int[] serie(int n) {
        int[] vector = new int[n];
        int impar = 3, acumulado = 1;
        for (int i = 0; i < n; i++) {
            vector[i] = acumulado;
            acumulado += impar;
            impar += 2;
        }
        return vector;
    }

    public static void mostrarVector(int[] vector) {
        StringBuilder salida = new StringBuilder();
        salida.append("[");
        for (int i = 0; i < vector.length; i++) {
            salida.append(vector[i]);
            if (i < vector.length - 1) {
                salida.append(" , ");
            }
        }
        salida.append("]");
        System.out.println(salida);
    }
}
