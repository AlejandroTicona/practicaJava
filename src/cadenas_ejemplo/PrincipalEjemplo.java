package cadenas_ejemplo;

import java.util.Scanner;

public class PrincipalEjemplo {
    
    public static void main(String[] args) {
        //instanciando nuevo objeto
        ReemplazoVocalesEjemplo reemplazo = new ReemplazoVocalesEjemplo();
        PalindromeEjemplo palindrome = new PalindromeEjemplo();
        ContarTiposEjemplo contarTipos = new ContarTiposEjemplo();
        Scanner sc = new Scanner(System.in);
        String cad;
        System.out.println("Digite una cadena: ");
        cad = sc.nextLine();
//        System.out.println("METODO 1");
//        reemplazo.reemplazarReplace(cad);
//        System.out.println("METODO 2");
//        reemplazo.reemplazar(cad);
//        palindrome.verificarPalindrome(cad);
        contarTipos.contarNumMayMin(cad);
    }
}
