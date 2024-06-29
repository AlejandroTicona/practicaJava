package descomposicion;

/*Dado un numero entero positivo n con sus dígitos 
distintos entre sí , se pide intercambiar el digito 
mayor con el digito menor*/
public class Ej24IntercambioMayorMenor {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionNumeroDistinto();
        System.out.println("El numero intercambiado es: "+cambiarNumeros(num));
    }

    public static int cambiarNumeros(int num) {
        int aux = num, nuevo_numero = 0, c = 0;
        while (aux > 0) {
            if (c == posMenor(num)) {
                nuevo_numero += mayor(num) * (Math.pow(10, c));
            } else if (c == posMayor(num)) {
                nuevo_numero += menor(num) * (Math.pow(10, c));
            } else {
                nuevo_numero += aux % 10 * (Math.pow(10, c));
            }
            c++;
            aux /= 10;
        }
        return nuevo_numero;
    }

    //a continuacion muchas funciones, siento que hay una mejor forma
    //de momento quiero codificar lo que paso a mi cabeza
    public static int posMayor(int num) {
        int pos = 0, c = 0, mayor = -1;
        while (num > 0) {
            if (num % 10 > mayor) {
                mayor = num % 10;
                pos = c;
            }
            c++;
            num /= 10;
        }
        return pos;
    }

    public static int mayor(int num) {
        int pos = 0, c = 1, mayor = -1;
        while (num > 0) {
            if (mayor < num % 10) {
                mayor = num % 10;
                pos = c;
            }
            c++;
            num /= 10;
        }
        return mayor;
    }

    public static int posMenor(int num) {
        int pos = 0, c = 0, menor = num % 10;
        while (num > 0) {
            if (menor > num % 10) {
                menor = num % 10;
                pos = c;
            }
            c++;
            num /= 10;
        }
        return pos;
    }

    public static int menor(int num) {
        int pos = 0, c = 0, menor = num % 10;
        while (num > 0) {
            if (menor > num % 10) {
                menor = num % 10;
                pos = c;
            }
            c++;
            num /= 10;
        }
        return menor;
    }

}
