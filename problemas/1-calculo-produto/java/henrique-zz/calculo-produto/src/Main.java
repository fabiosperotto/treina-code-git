import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\nDigite o código do produto: ");
        int codigoProduto = Integer.parseInt(input.nextLine());

        System.out.print("\nDigite a quantidade do produto: ");
        int qtdProduto = Integer.parseInt(input.nextLine());

        System.out.print("\nDigite o valor unitário do produto: R$ ");
        float valorProduto = Float.parseFloat(input.nextLine());

        float valorTotal = qtdProduto * valorProduto;

        String valorTotalFormatado = String.format("%.2f", valorTotal);

        System.out.print("\nO produto ID " + codigoProduto +" custa R$ " + valorTotalFormatado +"\n");

    }
}
