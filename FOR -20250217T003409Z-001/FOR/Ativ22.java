package LacoFor;

import java.util.Scanner;

//22. Exiba os divisores de um número informado pelo usuário.
public class Ativ22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("insira um numero: ");
        double numero = sc.nextInt();

        for (int i = 0; i <= numero; i++){
            if (numero % i == 0){
                System.out.println(i);
            }


        }




    }
}
