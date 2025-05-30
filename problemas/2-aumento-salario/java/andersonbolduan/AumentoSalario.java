package com.mycompany.salario.reajuste;

import java.util.Scanner;

public class AumentoSalario {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o salário atual: ");
        double valorSalario = entrada.nextDouble();
        
        double salarioAtualizado;
        int porcentagem = 0;

        if (valorSalario >= 0 && valorSalario <= 400.00) {
            porcentagem = 15;
        } else if (valorSalario <= 800.00) {
            porcentagem = 12;
        } else if (valorSalario <= 1200.00) {
            porcentagem = 10;
        } else if (valorSalario <= 2000.00) {
            porcentagem = 7;
        } else {
            porcentagem = 4;
        }

        salarioAtualizado = valorSalario + (valorSalario * porcentagem / 100);

        System.out.printf("Você receberá: R$ %.2f (%d%%)%n", salarioAtualizado, porcentagem);
        
        entrada.close();
    }
}
