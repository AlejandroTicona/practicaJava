package vectores;
/*2 -3 4 -5 6 -7 8 -9 10 -11*/
public class Ej26Serie3 {
    public static void main(String[] args) {
        System.out.println("Ingrese la dimension del veector: ");
        int n = Validaciones.validacionEntero(0);
        mostrarVector(serie(n));
    }
    
    public static int[] serie(int num){
        int[] vector = new int[num];
        int positivo = 2, negativo = -3;
        for (int i = 0; i < num; i++) {
            if(i % 2 ==0){
                vector[i] = positivo;
                positivo += 2;
            }else{
                vector[i] = negativo;
                negativo -=2;
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
