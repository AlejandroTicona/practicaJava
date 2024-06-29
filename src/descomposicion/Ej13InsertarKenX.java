package descomposicion;

/*Dado un numero X, insertar un digito K en la posición 2 
a partir del lado derecho. 
Ejemplo Si X=7382 y K=6 el nuevo número es X=73862*/
public class Ej13InsertarKenX {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        int k = MetodosUtiles.validacionNumero();
        System.out.println(insertar(num, k));
    }

    private static int insertar(int num, int k) {
        int resto = num%10 , nuevo_numero = (num / 10);
        int digitos_k = contarDigitos(k);
        
        nuevo_numero *= Math.pow(10, digitos_k+1);
        nuevo_numero += (k*10 )+(resto);
        return nuevo_numero;
    }

    private static int contarDigitos(int num) {
        return (int) ((Math.floor(Math.log10(Math.abs(num)))) + 1);
    }
}
