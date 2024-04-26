
package com.mycompany.problema.git;

import java.util.Scanner;

public class ProblemaGit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        double novoSalario = 0;
        double percentualReajuste = 0;

        if (salario <= 400.00) {
            percentualReajuste = 15;
        } else if (salario <= 800.00) {
            percentualReajuste = 12;
        } else if (salario <= 1200.00) {
            percentualReajuste = 10;
        } else if (salario <= 2000.00) {
            percentualReajuste = 7;
        } else {
            percentualReajuste = 4;
        }

        novoSalario = salario + (salario * (percentualReajuste / 100));

        System.out.printf("Você receberá: R$ %.2f (%.0f%%)\n", novoSalario, percentualReajuste);

        scanner.close();
    }
}


