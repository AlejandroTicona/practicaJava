package vectores;
/*1 4 1 16 1 36 1 64 1 100*/
public class Ej25Serie2 {
    public static void main(String[] args) {
        System.out.println("Ingresa la dimension del vector: ");
        int n = Validaciones.validacionEntero(0);
        mostrarVector(serie(n));
    }
    
    public static int[] serie(int num){
        int[] vector = new int[num];
        int base = 4, salto = 12 , suma_salto = 8;
        for (int i = 0; i < num; i++) {
            if(i%2==0){
                vector[i] = 1;
            }else{
                vector[i] = base;
                base+= salto;
                salto += suma_salto;
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
