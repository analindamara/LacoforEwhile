package Atividades;

public class Ativ_13 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
