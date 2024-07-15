
import java.util.Scanner;

/*
 * @author laisvarela
 */
public class fizzbuzz {

    /**
     * Leia um valor inteiro x. Faça um programa que mostre os números de 1 a x.
     * Cada número exibido deve seguir a seguinte regra:
     *
     * Se o número for divisível por 3, mostre "fizz" ao invés do número, e se
     * este for múltiplo de 5 exiba "Buzz". Se o número for divisível por ambos,
     * deve exibir somente "FizzBuzz". Caso o número não for nenhum dos casos
     * acima, mostre-o normalmente. Entrada: Deve ser esperado como entrada um
     * único valor do tipo inteiro.
     * @param x
     * @return 
     */
    public static String output(int x) {
        String y = "";

        if (x % 3 == 0 && x % 5 == 0) {
            y = "FizzBuzz";
        } else {
            if (x % 3 == 0) {
                y += "fizz";
            }
            if (x % 5 == 0) {
                y += "buzz";
            }
        }
        if (y.isEmpty()) {
            y = String.valueOf(x);
        }
        return y;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Informe um número inteiro e diferente de 0: ");
        x = input.nextInt();
        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                System.out.println(output(i));
            }
        } else {
            for (int i = x; i < 1; i++) {
                System.out.println(output(i));
            }
        }
    }
}
