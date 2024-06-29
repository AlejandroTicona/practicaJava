package descomposicion;

/*Pedir un número entero positivo, 
ordenar sus dígitos en forma ascendente 
y mostrar el nuevo número. 
Ejemplo si el número es 328596 se muestra 235689. */
public class Ej12Ordenamiento {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumero();
        System.out.println("El numero ordenado es: "+Ordenamiento(num));
    }

    public static int Ordenamiento(int num) {
        int nuevo_numero = 0, contador = 0, resto = 0, auxiliar = 0;
        while (contador <= 9) {
            auxiliar = num;
            while (auxiliar > 0) {
                resto = auxiliar % 10;
                if (resto == contador) {
                    nuevo_numero = (nuevo_numero * 10) + resto;
                }
                auxiliar = (auxiliar - resto) / 10;
            }
            contador++;
        }
        return nuevo_numero;
    }
}
