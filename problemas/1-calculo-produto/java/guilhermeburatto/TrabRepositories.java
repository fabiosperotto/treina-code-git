package trabrepositories;

import java.util.Scanner;

public class TrabRepositories {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = Integer.valueOf(scan.nextLine());
        
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = Integer.valueOf(scan.nextLine());
        
        System.out.println("Digite o valor do produto: ");
        float valor = Float.parseFloat(scan.nextLine());
        
        float total = valor * quantidade;

        System.out.println("O produto de ID " + codigo + " custa R$" + total);
        
    }    
}