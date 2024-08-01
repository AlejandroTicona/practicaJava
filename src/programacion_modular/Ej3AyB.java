package programacion_modular;

/*Dados números A y B, donde A es menor a B. 
Hallar la suma del cuadrado de los números pares, 
Hallar la suma de los números impares, 
Mostrar todos los números primos y contar todos 
los múltiplos de 3. Entre A y B.*/
public class Ej3AyB {

    public static void main(String[] args) {
        int a = 0, b = 0;
        boolean esMayor = false;
        System.out.println("Ingresa A: ");
        a = MetodosUtiles.validacionEntero();
        while (!esMayor) {
            System.out.println("Ingresa B, debe ser mayor a " + a + " :");
            b = MetodosUtiles.validacionEntero();
            if (b > a) {
                esMayor = true;
            }
        }
        System.out.println("ENTRE " + a + " y " + b);
        System.out.println("La suma de los cuadrados pares es: " + sumaCuadradoPares(a, b));
        System.out.println("La suma de los impares es: " + sumaImpares(a, b));
        mostrarPrimos(a, b);
        System.out.println("La cantidad de multiplos de 3 es: " + contarMultiplos3(a, b));
    }

    public static int sumaCuadradoPares(int a, int b) {
        int suma = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                suma += Math.pow(i, 2);
            }
        }
        return suma;
    }

    public static int sumaImpares(int a, int b) {
        int suma = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                suma += i;
            }
        }
        return suma;
    }

    public static void mostrarPrimos(int a, int b) {
        StringBuilder salida = new StringBuilder();
        for (int i = a; i <= b; i++) {
            boolean c = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    c = true;
                }
            }
            if (i == 1) {
                c = true;
            }
            if (c == false) {
                salida.append(i);
                if (i < b) {
                    salida.append(" , ");
                }
            }
        }
        System.out.println("Los numeros primos son: " + salida);
    }

    public static int contarMultiplos3(int a, int b) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                c++;
            }
        }
        return c;
    }
}
