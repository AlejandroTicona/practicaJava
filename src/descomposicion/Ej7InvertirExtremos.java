package descomposicion;

/*Pedir un número entero positivo mayor a 10, 
intercambiar el primer digito con el último 
y mostrar el nuevo número. Ejemplo si el número 
es 457 se muestra 754*/
public class Ej7InvertirExtremos {

    public static void main(String[] args) {
        System.out.println(invertirExtremos());
    }

    private static int invertirExtremos() {
        int numero = MetodosUtiles.validacionNumeroMayorA10();
        int nuevo_numero = 0, t = (numero % 10), c = 0;
        while (numero > 0) {
            if (numero  < 10) {
                nuevo_numero = (int) ((nuevo_numero + ((Math.pow(10, c)) * t))) + (numero % 10);
                break;
            }
            if (c == 0) {
                c++;
                numero /= 10;
            } else {
                nuevo_numero = (int) (nuevo_numero + ((numero % 10) * (Math.pow(10, c))));
                numero /= 10;
                c++;
            }
        }
        return nuevo_numero;
    }
}
