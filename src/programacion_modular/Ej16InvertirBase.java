package programacion_modular;

/*Dado un número X en base B (2,3,4,5,6, 7, 8, 9) convertir a base 10. Desplegar el número 
X y su equivalente en base 10.*/
public class Ej16InvertirBase {

    public static void main(String[] args) {
        System.out.println("INGRESA EL NUMERO EN BASE B");
        int num = MetodosUtiles.validacionEntero(); // Supongamos que este método verifica y obtiene el número de entrada
        System.out.println("INGRESA LA BASE DEL NUMERO");
        int base = MetodosUtiles.validacionEntero(); // Supongamos que este método verifica y obtiene la base de entrada

        int resultado = convertirABase10(num, base);
        System.out.println("El número " + num + " en base " + base + " es equivalente a " + resultado + " en base 10.");
    }

    public static int convertirABase10(int num, int base) {
        if (base < 2 || base > 9) {
            throw new IllegalArgumentException("La base debe estar entre 2 y 9.");
        }

        int resultado = 0;
        int potencia = 0;

        while (num > 0) {
            int digito = num % 10;
            resultado += digito * Math.pow(base, potencia);
            num /= 10;
            potencia++;
        }

        return resultado;
    }
}

