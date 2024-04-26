import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoProduto{

    public static void main(String[] args){

        int codigo, quantidade;
        float valor, total;

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("Digite o código do produto: ");
        codigo = Integer.valueOf(scan.nextLine());
        System.out.println("Digite a quantidade do produto: ");
        quantidade = Integer.valueOf(scan.nextLine());
        System.out.println("Digite o valor do produto: ");
        valor = Float.parseFloat(scan.nextLine());
        
        total = valor*quantidade;
        String totalFormat = String.format("%.02f", total);

        System.out.println("O produto ID " + codigo + " custa R$" + totalFormat);

    }

}