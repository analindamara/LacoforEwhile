package Laco_for;

public class ativ14 {
    public static void main(String[] args) {


        for(int i = 2; i <= 50; i++) { //pra contar de 2 a 50
            boolean primo = true;
            for(int j = 2; j < i; j++) {         //pra verificar se tem algum valor que é divisivel, olhando o valor atual com os antecessores
                if(i % j == 0) { //aqui eu verifico se tem algum valor divisivel (tipo o 4 que é divisivel por 2)
                    primo = false; //se tiver, meu primo fica falso
                }
            }
            if(primo) { //se chegar ate aqui com o primo sendo verdadeiro, é porque meu valor é primo
                System.out.println(i); //ai imprime esse primo
                    }
                }
            }

    }

