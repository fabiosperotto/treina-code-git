import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int id, quantidade;
        float valor, valorTotal;
        String continuar;

        do {
            System.out.print("Digite o id do produto: ");
            id = Integer.valueOf(input.nextInt());
            System.out.print("Digite o quantidade do produto "+ id +": ");
            quantidade = Integer.valueOf(input.nextInt());
            System.out.print("Digite o valor do produto "+ id +": ");
            valor = Float.valueOf(input.nextFloat());

            valorTotal = valor * quantidade;

            System.out.println("=========================================");
            System.out.print("O produto ID "+ id +" custa R$ "+ String.format("%.2f", valorTotal)+"\n");
            System.out.print("\nDeseja continuar? (S/N): ");
            continuar = input.next();
        } while (!continuar.equalsIgnoreCase("N"));
    }
}
