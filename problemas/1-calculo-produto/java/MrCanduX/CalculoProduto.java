import java.util.Scanner;
public class CalculoProduto {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("escreve o ID do produto: ");
        int id = input.nextInt();
        System.out.println("escreve a quantidade do produto: ");
        int quantidade = input.nextInt();
        System.out.println("escreve o valor unitario: ");
        float valorUnitario = input.nextFloat();

        float valorPago = valorUnitario * quantidade;
        String valorPagoFormatado = String.format("%.02f",valorPago);
        
        System.out.println("O produto "+id+" custa R$: "+valorPagoFormatado);

        
    }
}
  
