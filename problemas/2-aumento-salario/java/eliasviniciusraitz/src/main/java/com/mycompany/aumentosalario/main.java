
package com.mycompany.aumentosalario;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

       Scanner input = new Scanner (System.in);

      float salario, novoSalario = 0;
      int percentualAumento = 0;

      System.out.println("Digite seu salário: ");
      salario = Float.valueOf(input.nextLine());

      if(salario >= 0 && salario <= 400){
        novoSalario = (float) (salario + salario * 0.15);
        percentualAumento = 15;
      } else if(salario > 400 && salario <= 800) {
        novoSalario = (float) (salario + salario * 0.12);
        percentualAumento = 12;
      } else if(salario > 800 && salario <= 1200){
        novoSalario = (float) (salario + salario * 0.1);
        percentualAumento = 10;
      } else if(salario > 1200 && salario <= 2000){
        novoSalario = (float) (salario + salario * 0.07);
        percentualAumento = 7;
      } else if(salario > 2000){
        novoSalario = (float) (salario + salario * 0.04);
        percentualAumento = 4;
      } else {
      System.out.println("Valor inválido!! Execute o programa novamente e informe um valor positivo.");
      }

      System.out.println("Você receberá R$" + novoSalario + " (" + percentualAumento + "%)");
    }
    
}
