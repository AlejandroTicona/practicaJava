package programacion_modular;

/*(Números perfectos) Se dice que un número entero es un 
número perfecto si la suma de sus divisores, 
incluyendo 1 (pero no el número en sí), es igual al número. 
Por ejemplo, 6 es un número perfecto ya que 6 = 1 + 2 + 3. 
 Escriba una función llamada perfecto que determine si 
el parámetro número es un número perfecto. 
 Use la función anterior en un programa que determine 
e imprima todos los números perfectos entre 1 y 1000. */
public class Ej5NumerosPerfectos {

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if(perfecto(i)){
                System.out.print(i+" , ");
            }
        }
    }

    public static boolean perfecto(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }
}
