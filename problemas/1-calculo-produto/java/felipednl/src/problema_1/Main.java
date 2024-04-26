package problema_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o código do produto: ");
        int cod = Integer.parseInt(input.nextLine());
        
        System.out.print("Digite a quantidade: ");
        int quantidade = Integer.parseInt(input.nextLine());
        
        System.out.print("Digite o valor unitário: ");
        float valorUnit = Float.parseFloat(input.nextLine());
        
        float valorTotal = valorUnit * quantidade; 
        
        System.out.println("O produto ID "+cod+" custa R$: "+valorTotal);
    }
    
}