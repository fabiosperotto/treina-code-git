import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o código do produto: ");
        int cod = Integer.parseInt(input.nextLine());
        
        System.out.print("Digite a quantidade: ");
        int quant = Integer.parseInt(input.nextLine());
        
        System.out.print("Digite o valor do produto: ");
        float valor = Float.parseFloat(input.nextLine());
        
        float valorTotal = valor * quant; 
        
        System.out.println("O produto com ID: "+ cod +" custa R$: "+valorTotal);
    }
    
}