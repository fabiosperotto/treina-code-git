import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codProduto;
        int quantidade;
        double valorProd;
        double valorPagar;

        System.out.println("----- Calculo do Produto -----");
        System.out.println("Informe o Codigo do Produto: ");
        codProduto = Integer.valueOf(input.nextLine());
        System.out.println("Informe a Quantidade do Produto: ");
        quantidade = Integer.valueOf(input.nextLine());
        System.out.println("Informe o Valor do Produto: ");
        valorProd = Double.valueOf(input.nextLine());

        valorPagar = (valorProd * quantidade);

        System.out.println("O produto ID " + codProduto + " custa R$: " + valorPagar);

        // Anthoni da Luz..
    }
}
