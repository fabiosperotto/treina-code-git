
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int x = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int j = sc.nextInt();
        System.out.println("\n");
        
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("\n");
        
        for (int k = 1; k <= j; k++) {
            if (k % 3 == 0 && k % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (k % 3 == 0) {
                System.out.println("Fizz");
            } else if (k % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(k);
            }
        }
        
        sc.close();
    }
}


