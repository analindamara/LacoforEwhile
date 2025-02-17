package Laco_for;

import java.util.Scanner;

public class Atiiv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira uma palavra: ");
        String palavra = sc.next();

        for (int i = palavra.length(); i > 0; i--) {
            System.out.println(palavra.charAt(i-1));
        }

    }
}
