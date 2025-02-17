package Laco_for;

public class ati15 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("buzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            }
            System.out.println(i);
        }

    }
}