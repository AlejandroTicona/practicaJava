package cadenas_ejemplo;

/**
 * Verificar si una palabra es palindrome
 *
 * @author Alejandro Ticona
 */
public class PalindromeEjemplo {

    public void verificarPalindrome(String cad) {
        int n;
        String cadAux = "";
        n = cad.length();
        char car;
        for (int j = n - 1; j >= 0; j--) {
            car = cad.charAt(j);
            cadAux += car;
        }
        if(cad.equals(cadAux)){
            System.out.println("La palabra es palindrome");
        }else{
            System.out.println("La palabra no es palindrome");
        }
    }
}
