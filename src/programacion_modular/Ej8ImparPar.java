package programacion_modular;

/*Dado un número N verificar si es par o impar sin utilizar 
DIV, MOD, /, o la función parte entera o []*/
public class Ej8ImparPar {

    public static void main(String[] args) {
        int n = MetodosUtiles.validacionEntero();
        if (determinarPar(n)) {
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " es impar");
        }
    }

    public static boolean determinarPar(int num) {
        int n = Math.abs(num);
        while (n > 1) {
            n -= 2;
        }
        return n == 0;
    }
}
