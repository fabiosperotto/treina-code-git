package problema2_aumento_salario;

import java.util.Scanner;

/**
 * A classe Problema2_aumento_salario contém a resolucao do problema numero 2.
 * Ela realiza os calculos necessarios e apresenta o novo valor do salario.
 * 
 * @author Leonardo de Souza da Luz
 */
public class Problema2_aumento_salario {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o salário atual do funcionário
        System.out.print("Digite o seu salario atual: ");
        double salarioAtual = scanner.nextDouble();

        // Calcula o percentual de reajuste e o novo salário
        double novoSalario;
        double percentualReajuste;
        
        if (salarioAtual <= 400.00) {
            percentualReajuste = 15;
        } else if (salarioAtual <= 800.00) {
            percentualReajuste = 12;
        } else if (salarioAtual <= 1200.00) {
            percentualReajuste = 10;
        } else if (salarioAtual <= 2000.00) {
            percentualReajuste = 7;
        } else {
            percentualReajuste = 4;
        }
        novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        // Imprime o resultado formatado
        System.out.printf("Voce recebera: R$ %.2f (%.0f%%)%n", novoSalario, percentualReajuste);

        scanner.close();
    }
}
