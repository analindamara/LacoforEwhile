package Laco_for;

public class Ativ13 {
    public static void main(String[] args) {
        int n1=1;
        int n2=1;

        System.out.print("Primeiros 10 digitos da sequencia de Fibonacci: \n1\n1");
        for(int i =0; i<8 ;i++){
            int soma = n1+n2;
            System.out.print("\n" + soma);
            n1 = n2;
            n2 = soma;
        }
    }
}
