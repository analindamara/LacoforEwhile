package Laco_for;

import java.util.Scanner;

public class Ativ19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("insira um numero: ");
        int numero= sc.nextInt();
        int fatorial =1;
        for (int i = 1; i<=numero; i++ ){
            fatorial*=i;

        }
        System.out.println(fatorial);

    }
}
