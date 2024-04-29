import java.util.Scanner;

public class CalculaValorProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int codigo = scanner.nextInt();
            int quantidade = scanner.nextInt();
            double valorUnitario = scanner.nextDouble();

            double valorTotal = quantidade * valorUnitario;
            System.out.printf("O produto ID %d custa R$ %.2f\n", codigo, valorTotal);
        }

        scanner.close();
    }
}
