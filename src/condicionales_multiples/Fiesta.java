package condicionales_multiples;

import java.util.Scanner;

public class Fiesta {

    /*
    Petronita organiza una fiesta en la cual una 
    computadora controla el ingreso 
    mediante 5 claves. Si se ingresa al menos 
    una clave incorrecta esta imprimirá 
    "TE EQUIVOCASTE DE FIESTA" y no 
    permitirá el ingreso. Si las 5 claves son 
    correctas imprimirá "BIENVENIDO A LA FIESTA" 
    Las Claves son: 
    1: "TIENES" 
    2: "QUE SER" 
    3: "INVITADO" 
    4: "PARA" 
    5: "INGRESAR"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena = "";
        System.out.println("FIESTA DE PETRONITA\n");
        System.out.println("Ingresa la contrasena 1: ");
        contrasena = sc.nextLine();
        if (contrasena.equalsIgnoreCase("TIENES")) {
            System.out.println("Continua...");
            contrasena = sc.nextLine();
            if (contrasena.equalsIgnoreCase("QUE SER")) {
                System.out.println("Continua...");
                contrasena = sc.nextLine();
                if (contrasena.equalsIgnoreCase("INVITADO")) {
                    System.out.println("Continua...");
                    contrasena = sc.nextLine();
                    if (contrasena.equalsIgnoreCase("PARA")) {
                        System.out.println("Continua...");
                        contrasena = sc.nextLine();
                        if (contrasena.equalsIgnoreCase("INGRESAR")) {
                            System.out.println("BIENVENIDO A LA FIESTA!!!");
                            return;
                        }
                    }
                }
            }
        } else {
            System.out.println("TE EQUIVOCASTE DE FIESTA");
        }
        System.out.println("TE EQUIVOCASTE DE FIESTA");

    }
}
