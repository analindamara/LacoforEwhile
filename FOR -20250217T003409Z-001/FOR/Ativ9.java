package Laco_for;

import java.util.Scanner;
public class Ativ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um numero");
        int n1 = sc.nextInt();
        int tabuada = n1 * 10;


        for (int i = 0; i <= tabuada; i += n1) {
            System.out.println(i);
        }

    }
}