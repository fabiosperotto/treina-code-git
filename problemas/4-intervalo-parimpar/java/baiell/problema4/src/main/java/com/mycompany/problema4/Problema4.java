package com.mycompany.problema4;

import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {

        int numeroBase, numeroLimite, quantidadePar = 0, quantidadeImpar = 0, numero = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número base para o intervalo: ");
        numeroBase = scan.nextInt();

        System.out.print("Informe um número limite para o intervalo: ");
        numeroLimite = scan.nextInt();

        while (numero != 0) {
            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if (numero > numeroBase && numero < numeroLimite) {

                if (numero % 2 == 0) {
                    quantidadePar++;
                } else {
                    quantidadeImpar++;
                }
            }
        }
        System.out.println("Para o intervalo entre " + numeroBase + " e " + numeroLimite
                + ", existem " + quantidadePar + " números pares e " + quantidadeImpar + " números impares.");
    }
}
