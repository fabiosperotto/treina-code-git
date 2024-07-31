import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o código: ");
        int codigo = Integer.parseInt(entrada.nextLine());

        System.out.print("informe a quantidade: ");
        int quantidade = Integer.parseInt(entrada.nextLine());

        System.out.print("informe o valor: ");
        float preco = Float.parseFloat(entrada.nextLine());
        float total = preco * quantidade; 
        System.out.println("O produto ID: "+codigo+" custa R$: "+total);
    }
    
}