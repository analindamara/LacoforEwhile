package Laco_While;

import java.util.Scanner;

public class ativ6While {
    public static void main(String[] args) {
        //Calcule a soma dos números de 1 a 50 usando do while.
        Scanner sc= new Scanner(System.in);
        int i=1;
        int soma=0;

        do {
            soma += i;
            i++;
        }
        while (i <= 50);


        System.out.println(soma);

    }
}
