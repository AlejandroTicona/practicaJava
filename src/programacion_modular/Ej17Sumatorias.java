package programacion_modular;

/*. Realizar las siguientes sumatorias para N términos, 
utilizando las funciones o procedimientos necesarios.*/
public class Ej17Sumatorias {

    public static void main(String[] args) {

        System.out.println("Ingrese una opcion: ");
        System.out.println("1. Sumatoria denominador factorial");
        System.out.println("2. Doble escalera, no sabia que nombre ponerle");
        System.out.println("3. Sumatoria factorial");
        System.out.println("4. Sumatoria con potencias");
        System.out.println("5. Fraccion compuesta");
        System.out.println("6. x Fraccion");
        int opc = MetodosUtiles.validacionNumeroParametro(6);
        System.out.println("Ingresa n: ");
        int n = MetodosUtiles.validacionEntero();
        switch (opc) {
            case 1:
                sumatoria1(n);
                break;
            case 2:
                sumatoria2(n);
                break;
            case 3:
                sumatoria3(n);
                break;
            case 4:
                sumatoria4(n);
                break;
            case 5:
                sumatoria5(n);
                break;
            case 6:
                sumatoria6(n);
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }

    public static void sumatoria1(int num) {
        StringBuilder salida = new StringBuilder();
        int denominador = 1, numerador = 1;
        float sumatoria = 0;
        for (int i = 1; i <= num; i++) {
            salida.append("(" + numerador + "/" + denominador + "!)");
            if (i % 2 == 0) {
                sumatoria -= numerador / (factorial(denominador));
            } else {
                sumatoria += numerador / (factorial(denominador));
            }
            if (i < num) {
                if (i % 2 == 0) {
                    salida.append(" + ");
                } else {
                    salida.append(" - ");
                }
            }
            denominador++;
            numerador += 2;
        }
        System.out.println("La sumatoria: \n" + salida);
        System.out.println("Equivale a :" + sumatoria);
    }

    public static float factorial(int num) {
        int salida = 1;
        for (int i = 1; i <= num; i++) {
            salida *= i;
        }
        return salida;
    }

    public static void sumatoria2(int num) {
        StringBuilder salida = new StringBuilder();
        int impar = 1, par = 2, sumatoria = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sumatoria += impar;
                salida.append(impar);
                impar = impar + 2;
            } else {
                sumatoria += par;
                salida.append(par);
                par = par + 3;
            }
            if (i < num) {
                salida.append(" + ");
            }

        }
        System.out.println("La sumatoria " + salida);
        System.out.println("Equivale a " + sumatoria);
    }

    public static void sumatoria3(int num) {
        StringBuilder salida = new StringBuilder();
        int numerador = 2, denominador = 3;
        float sumatoria = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sumatoria += numerador / Math.pow(denominador, 3);
                salida.append("(" + numerador + "/" + denominador + "^" + 3 + ")");
                if (i < num) {
                    salida.append(" - ");
                }
            } else {
                sumatoria -= numerador / Math.pow(denominador, 3);
                salida.append("(" + numerador + "/" + denominador + "^" + 3 + ")");
                if (i < num) {
                    salida.append(" + ");
                }
            }
            numerador += 2;
            denominador += 2;
        }
        System.out.println("La sumatoria es: ");
        System.out.println(salida);
        System.out.println(" = " + sumatoria);
    }

    public static void sumatoria4(int num) {
        StringBuilder salida = new StringBuilder();
        int sumatoria = 0;
        for (int i = 2; i <= num + 1; i++) {
            salida.append("(" + i + "^" + (i + 1) + ")");
            sumatoria += Math.pow(i, i + 1);
            if (i < num + 1) {
                salida.append(" + ");
            }
        }
        System.out.println("La sumatoria es ");
        System.out.println(salida);
        System.out.println(" = " + sumatoria);
    }

    public static void sumatoria5(int num) {
        StringBuilder salida = new StringBuilder();
        System.out.println("Ingresa x");
        int x = MetodosUtiles.validacionEntero();
        float n = num, sumatoria = 0;
        for (int i = 1; i <= num; i++) {
            salida.append("((" + x + "+" + i + ")! / (" + x + "^(" + n + "-" + (i - 1) + ")))");
            sumatoria += (float) ((factorial(x + i)) / Math.pow(x, (n - (i - 1))));
            if (i < num) {
                salida.append(" + ");
            }
        }
        System.out.println("SUMATORIA 5");
        System.out.println(salida);
        System.out.println(" = " + sumatoria);
    }

    public static void sumatoria6(int num) {
        StringBuilder salida = new StringBuilder();
        float divisor = 12;
        System.out.println("Ingresa el valor de X: ");
        float x = MetodosUtiles.validacionEntero();
        float sumatoria = 0;
        for (int i = 1; i <= num; i++) {
            salida.append("(" + (int)x + "/" + (int)divisor + ")");
            sumatoria += (float)(x / divisor);
            divisor += 2;
            if (i < num) {
                salida.append(" + ");
            }
        }
        System.out.println("SUMATORIA");
        System.out.println(salida);
        System.out.println(sumatoria);

    }
}
