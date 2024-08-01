package programacion_modular;

/*
Dado un número X entero positivo, añadir los dígitos 
que sean necesarios a N para obtener un nuevo número 
capicúa en R. Realizar un método para este proceso.
Ejemplo: Entra X = 4568 
 Sale R = 4568654 654 son los dígitos aumentados*/
public class Ej11Capicua {

    public static void main(String[] args) {
        int num = MetodosUtiles.validacionEntero();
        if (isCapicua(num)) {
            System.out.println("El numero ya es capicua :b");
        } else {
            System.out.println(convCapicua(num));
        }
    }

    public static boolean isCapicua(int num) {
        int num1 = 0, num2 = num;
        while (num > 0) {
            num1 *= 10;
            num1 += num % 10;
            num /= 10;
        }
        return num1 == num2;
    }

    public static int convCapicua(int num) {
        int n1 = num, n2 = num;
        num /= 10;
        while (num > 0) {
            n2 *= 10;
            n2 += num % 10;
            num /= 10;
        }
        return n2;
    }
}
