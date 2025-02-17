package Laco_for;
//16. Exiba os caracteres de uma string informada pelo usuário.
import java.util.Scanner;

//16. Exiba os caracteres de uma string informada pelo usuário.
public class ativ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira uma palavra: ");
        String  palavra = sc.next();
        for (int i = 0 ; i <= palavra.length(); i++) {

            System.out.println (palavra.charAt(i)) ;

        }
    }
}