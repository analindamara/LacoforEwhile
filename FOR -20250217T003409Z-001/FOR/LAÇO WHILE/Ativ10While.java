package Atividadeswhile;

import java.util.Scanner;

public class Ativ10While {
    public static void main(String[] args) {
        //Conte e exiba quantos números foram digitados antes de o usuário digitar zero.
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int numero;

        System.out.println("insira um numero: ");
        numero = sc.nextInt();

         while (numero != 0){
            i++;

            System.out.print("Insira outro número: ");
            numero = sc.nextInt();

        }

         System.out.println("Você digitou " + i + " números antes de digitar zero.");
    }

}