package descomposicion;

/*Dado un numero X, los dígitos pares 
remplazar por su inmediato impar, 
desplegar el nuevo número.*/
public class Ej6ReemplazarPares {

    public static void main(String[] args) {
        System.out.println(reemplarazaPares());
    }

    public static int reemplarazaPares() {
        int numero = MetodosUtiles.validacionNumero();
        int nuevo_numero = 0, c = 0;
        while (numero > 0) {
            if ((numero % 10) % 2 == 0) {
                nuevo_numero += (((numero % 10) + 1) * Math.pow(10, c));
            } else {
                nuevo_numero += ((numero % 10) * Math.pow(10, c));
            }
            numero /= 10;
            c++;
        }

        return nuevo_numero;

    }
}
