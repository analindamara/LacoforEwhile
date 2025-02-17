package Atividadeswhile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ativ9While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        List<Integer> positivos = new ArrayList<>();
        do {
            System.out.println("insira um numero: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                positivos.add(numero);
            }
        }while(numero > 0);
        for (int num : positivos) {
            System.out.print(num + " ");
        }
    }

}
