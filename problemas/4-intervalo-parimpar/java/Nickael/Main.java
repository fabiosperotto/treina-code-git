
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número base para o intervalo:");
        int a = scanner.nextInt();

        System.out.println("Informe um número limite para o intervalo:");
        int b = scanner.nextInt();

        int pares = 0;
        int impares = 0;

        System.out.println("Informe um número qualquer (0 para sair):");
        int num = scanner.nextInt();

        while (num != 0) {
            if (num >= a && num <= b) {
                if (num % 2 == 0) {
                    
                    
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Informe um número qualquer (0 para sair):");
            num = scanner.nextInt();
        }

        System.out.println("Para o intervalo " + a + " e <= " + b + " existem " + pares + " números pares e " + impares + " números ímpares");

        scanner.close();
    }
}
    


