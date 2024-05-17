package condicionales_multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotasMateria {

    /*. Dadas las notas de todas las materias que cursa. Identificar si el estudiante fue 
    promovido a segundo año. Si tiene segundo turno (Reprobado hasta 3 materias) o 
    perdió el año*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3, m4, m5, m6, c = 0;
        System.out.println("Ingrese la nota final de su materia 1: ");
        try {
            m1 = sc.nextInt();
            System.out.println("Ingrese la nota final de su materia 2: ");
            m2 = sc.nextInt();
            System.out.println("Ingrese la nota final de su materia 3: ");
            m3 = sc.nextInt();
            System.out.println("Ingrese la nota final de su materia 4: ");
            m4 = sc.nextInt();
            System.out.println("Ingrese la nota final de su materia 5: ");
            m5 = sc.nextInt();
            System.out.println("Ingrese la nota final de su materia 6: ");
            m6 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar solo numeros enteros");
            return;
        }

        if (m1 < 61) {
            c++;
        }
        if (m2 < 61) {
            c++;
        }
        if (m3 < 61) {
            c++;
        }
        if (m4 < 61) {
            c++;
        }
        if (m5 < 61) {
            c++;
        }
        if (m6 < 61) {
            c++;
        }

        if (c == 3) {
            System.out.println("El estudiante tiene 2do turno");
        } else if (c > 3) {
            System.out.println("El estudiante perdio el año");
        } else {
            System.out.println("El estudiante fue promovido a 2do anio");
        }
    }
}
