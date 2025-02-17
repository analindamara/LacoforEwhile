package Atividadeswhile;

import java.util.Scanner;

public class Ativ8WHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //38. Exiba os números ímpares de 1 a 20 usando do while.
        int i = 1;
        while (i <= 20) {
            i++;
            if (i % 2 != 0) System.out.println(i);
        }
    }
}