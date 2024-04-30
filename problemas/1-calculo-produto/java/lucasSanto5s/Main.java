
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int codigo, quantidade;
        float valorUnitario, valorTotal;

        Scanner input = new Scanner(System.in);
        

        System.out.println("Digite o código do produto: ");
        codigo = Integer.valueOf(input.nextLine());
        System.out.println("Digite a quantidade do produto: ");
        quantidade = Integer.valueOf(input.nextLine());
        System.out.println("Digite o valor do produto: ");
        valorUnitario = Float.parseFloat(input.nextLine());
        
        valorTotal= valorUnitario * quantidade;
       
      


        System.out.println("O produto ID " + codigo + " custa R$" + valorTotal);

    }

}