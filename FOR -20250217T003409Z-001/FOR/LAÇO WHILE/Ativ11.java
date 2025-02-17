package Atividadeswhile;

import java.util.Scanner;
//Exiba os caracteres de uma string informada pelo usuário usando do while.
public class Ativ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira uma palavra");
        String palavra = sc.next();
        int i = 0;
        while (palavra.length()  >=  i){
            i++;

            System.out.println(palavra.charAt(i));
        }

    }
}
