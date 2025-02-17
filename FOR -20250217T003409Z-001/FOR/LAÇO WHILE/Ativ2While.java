package Laco_While;

import java.util.Scanner;

public class Ativ2While {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int soma=0;
        int x;
        System.out.println("insira um numero: ");
        x= sc.nextInt();

        while (x > 0 ){
            soma+=x;
            System.out.println("insira um numero novamente: ");
            x= sc.nextInt();

        }
            System.out.println("a soma dos numeros é:  " + soma);

    }
}
