package condicionales_simples_dobles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Imc {

    /*solicite el peso y estatura de una persona e 
    informe cuál es su índice de masa corporal(IMC). 
    Además, debe informar con mensajes apropiados la 
    situación de la persona de acuerdo al siguiente cuadro:
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float estatura, peso, imc;
        try {
            System.out.println("Ingresa la estatura cm: ");
            estatura = sc.nextFloat();
            System.out.println("Ingresa el peso kg: ");
            peso = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar solo numeros!!!");
            return;
        }
        estatura = (float) estatura / 100;
        imc = (float) (peso / (Math.pow(estatura, 2)));
        if (imc < 18.49) {
            System.out.println("Su indice de masa corporal es de: " + imc + " Usted tiene Infrapeso");
        } else if (imc >= 18.50 && imc <= 24.99) {
            System.out.println("Su indice de masa corporal es de: " + imc + " Usted tiene Peso Normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Su indice de masa corporal es de: " + imc + " Usted tiene Sobre Peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Su indice de masa corporal es de: " + imc + " Usted tiene Obesidad Leve");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Su indice de masa corporal es de: " + imc + " Usted tiene Obesidad Media");
        } else if (imc >= 40) {
            System.out.println("Su indice de masa corporal es de: " + imc + " Usted tiene Obesidad Morbida");
        }
    }
}
