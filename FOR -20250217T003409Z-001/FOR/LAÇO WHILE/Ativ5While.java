package Laco_While;

import java.util.Scanner;

//Exiba a tabuada do número informado pelo usuário usando do while.
public class Ativ5While {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x;
        int i = 0;
        System.out.println("insira um numero : ");
        x = sc.nextInt();
        do {
            System.out.println(x + " x " + " = " +(x * i));
            i++;

        } while (i <= 10);

        sc.close();
     }

}
