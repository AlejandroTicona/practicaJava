package vectores;
/*0 1 0 1 1 0 1 1 1 0*/
public class Ej27SerieBinarie {
    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del vector: ");
        int dimension = Validaciones.validacionEntero(0);
        mostrarVector(serie(dimension));
    }
    
    public static int[] serie(int num){
        int[] vector = new int[num];
        int sc = 0, c = 0;
        for (int i = 0; i < num; i++) {
            if(sc == c){
                vector[i] = 0;
                c ++;
                sc = 0;
            }else{
                sc++;
                vector[i] = 1;
            }
        }
        return vector;
    }
    
    public static void mostrarVector(int[] vector){
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
