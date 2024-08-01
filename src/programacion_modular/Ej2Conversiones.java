package programacion_modular;

/*Desarrollar un programa que haga operaciones de conversión de medidas hasta que el 
usuario decida que no quiere hacer más conversiones.
 Pulgadas a centímetros
 Libras a gramos
 Grados Fahrenheit a centígrados
 Galones a litros*/
public class Ej2Conversiones {

    public static void main(String[] args) {
        System.out.println("CONVERSIONES");
        System.out.println("1.Pulgadas a centimetros\n2.Libras a gramos\n3.Grados fahrenheit a centigrados\n4.Galones a litros");
        int opc = MetodosUtiles.validacionNumeroParametro(4);
        switch (opc) {
            case 1:
                System.out.println(pulgadasCentimetros()+"cm");
                break;
            case 2:
                System.out.println(librasGramos()+"gr");
                break;
            case 3:
                System.out.println(fahrenheitCelsius()+"ºC");
                break;
            case 4:
                System.out.println(galonesLitros()+"l");
                break;
            default:
                System.out.println("Por logica este error nunca saldra");
        }
    }

    public static float pulgadasCentimetros() {
        System.out.println("Ingresa las pulgadas: ");
        float pulgadas = MetodosUtiles.validacionFlotante();
        return (float) (pulgadas * 2.54);
    }

    public static float librasGramos() {
        System.out.println("Ingresa las libras: ");
        float libras = MetodosUtiles.validacionFlotante();
        return (float) (libras * 453.592);
    }

    public static float fahrenheitCelsius() {
        System.out.println("Ingresa los grados Fahrenheit: ");
        float fahrenheit = MetodosUtiles.validacionFlotante();
        return (float) (fahrenheit - 32) * (5 / 9);
    }

    public static float galonesLitros() {
        System.out.println("Ingrese los galones: ");
        float galones = MetodosUtiles.validacionFlotante();
        return (float) 3.785412 * galones;
    }
}
