package sumatorias;

/*Hallar la suma de los pares e impares por separado, 
comprendidos entre 20 y 100 desplegar los resultados.*/
public class Ej4SumasSeparadasComprendidas20_100 {

    public static void main(String[] args) {
        sumaParImparSeparada20_100();
    }

    public static void sumaParImparSeparada20_100() {
        int a_par=0 , a_impar=0;
        for (int i = 20; i <= 100; i++) {
            if(i%2==0){
                a_par +=  i;
            }else{
                a_impar += i;
            }
        }
        System.out.println("La suma de impares entre 20 y 100 es: "+a_impar+"\nLa suma de pares ntre 20 y 100 es: "+a_par);
    }
}
