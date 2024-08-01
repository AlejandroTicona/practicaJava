package programacion_modular;

/*Escriba una función que recibe la hora en forma de 
tres argumentos enteros (horas, minutos y segundos) 
y devuelva el número de segundos transcurridos desde 
la última vez que el reloj “marcó las 12”. 
Use esta función para calcular el monto de tiempo en 
segundos entre dos horas, ambas de las cuales 
están dentro de un ciclo de 12 horas del reloj.*/
import java.util.Scanner;

public class Ej4EntreHoras {

    public static void main(String[] args) {
        System.out.println("HORA 1");
        System.out.println("Ingrese las horas: ");
        int hora1 = validarRango(1, 12);
        System.out.println("Ingrese los minutos: ");
        int minutos1 = validarRango(0, 59);
        System.out.println("Ingrese los segundos: ");
        int segundos1 = validarRango(0, 59);
        System.out.println("HORA 2");
        System.out.println("Ingrese las horas: ");
        int hora2 = validarRango(1, 12);
        System.out.println("Ingrese los minutos: ");
        int minutos2 = validarRango(0, 59);
        System.out.println("Ingrese los segundos: ");
        int segundos2 = validarRango(0, 59);

        int segundos_calculados1 = segundosCalculados(segundos1, minutos1, hora1);
        int segundos_calculados2 = segundosCalculados(segundos2, minutos2, hora2);

        System.out.println(hora1 + ":" + minutos1 + ":" + segundos1);
        System.out.println(hora2 + ":" + minutos2 + ":" + segundos2);

        System.out.println("La diferencia entre las 2 horas es: " + componer(diferencia2Horas(segundos_calculados1, segundos_calculados2)));
        System.out.println("Los segundos transcurridos entre las 2 horas es : " + diferencia2Horas(segundos_calculados1, segundos_calculados2));
    }

    public static int diferencia2Horas(int seg1, int seg2) {
        int diferencia = Math.abs(seg1 - seg2);
        if (diferencia > 21600) {
            diferencia = 43200 - diferencia;
        }
        return diferencia;
    }

    public static String componer(int num) {
        int horas = num / 3600;
        num = num % 3600;
        int minutos = num / 60;
        int segundos = num % 60;
        return (horas + ":" + minutos + ":" + segundos);
    }

    public static int segundosCalculados(int segundos, int minutos, int horas) {
        horas = (horas == 12) ? 0 : horas;
        int salida = 0;
        salida += 1 * (segundos);
        salida += 60 * (minutos);
        salida += 3600 * (horas);
        return salida;
    }

    public static int validarRango(int inf, int sup) {
        Scanner sc = new Scanner(System.in);
        int hora = 0;
        boolean isHour = false;
        while (!isHour) {
            System.out.println("Ingresa la hora(" + inf + "-" + sup + "): ");
            if (sc.hasNextInt()) {
                hora = sc.nextInt();
                if (hora >= inf && hora <= sup) {
                    isHour = true;
                } else {
                    System.out.println("La hora debe estar entre " + inf + "-" + sup);
                }
            } else {
                System.out.println("Debe ingresar un numero");
                sc.next();
            }
        }
        return hora;
    }
}
