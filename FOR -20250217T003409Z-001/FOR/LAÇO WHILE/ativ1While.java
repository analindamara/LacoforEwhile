package Laco_While;

import java.util.Scanner;

public class ativ1While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("insira um numero: ");
         x = sc.nextInt();
         while (x >= 0 ){
            System.out.println("insira um numero novamente: ");
            x= sc.nextInt();

        }
        System.out.println(x);


    sc.close();
}
}