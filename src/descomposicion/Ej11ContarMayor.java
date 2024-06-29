package descomposicion;

/*Dado un número natural, Contar cuantas veces 
se repite el dígito mayor.*/
public class Ej11ContarMayor {

    public static void main(String[] args) {
        int numero = MetodosUtiles.validacionNumero();
        System.out.println("Se repitio un total de "+contarMayor(numero)+" veces");
    }

    public static int contarMayor(int num) {
        int mayor = -1, contador = 0;
        while (num > 0) {
            if ((num % 10) >= mayor) {
                mayor = (num % 10);
                if ((num % 10) == mayor) {
                    contador ++;
                } else {
                    contador = 1 ;
                }
            }
            num /= 10;
        }
        System.out.println("El mayor es "+mayor);
        return contador;
    }
}
