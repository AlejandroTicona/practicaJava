package descomposicion;
/*Dado un numero entero positivo n ordenar 
sus dígitos en forma descendente */
public class Ej26OrdenarDescendente {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        System.out.println("El numero ordenado es: " + ordenar(num));
    }

    public static int ordenar(int num) {
        int d = 0, nn = 0, c = 0, aux = 0;
        while (d <= 9) {
            aux = num;
            while (aux > 0) {
                if ((aux % 10) == d) {
                    nn +=  ((aux % 10) * (int)(Math.pow(10, c)));
                    c++;
                }
                aux /= 10;
            }
            d++;
        }
        return nn;
    }
}
