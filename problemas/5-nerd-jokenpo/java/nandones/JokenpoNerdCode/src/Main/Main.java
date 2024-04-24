/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Fernando Vedana
 */
public class Main {
    static int pontosPlayer1 = 0, pontosPlayer2 = 0;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("""
                           REGRAS DO NERD JOKENPO:
                           
                           PEDRA > LAGARTO
                           PEDRA > TESOURA
                           PAPEL > PEDRA
                           PAPEL > SPOCK
                           TESOURA > PAPEL
                           TESOURA > LAGARTO
                           LAGARTO > PAPEL
                           LAGARTO > SPOCK
                           SPOCK > TESOURA
                           SPOCK > PEDRA
                           ---------------------------------------------------
                           """);
        System.out.println("INSIRA O NOME DO PLAYER 1:");
        String player1 = input.nextLine();
        System.out.println("INSIRA O NOME DO PLAYER 2:");
        String player2 = input.nextLine();
        
        System.out.println("quantas rodadas serão jogadas?");
        int rodadas = input.nextInt();
        
        for (int i = 0; i < rodadas; i++) {
            System.out.println("utilize os números do teclado para jogar:\n"
                    + "pedra(1)\n"
                    + "papel(2)\n"
                    + "tesoura(3)\n"
                    + "lagarto(4)\n"
                    + "spock(5)\n");
            System.out.println("insira a "+ (i+1) + "a jogada de "+ player1+ ":");
            int jogada1 = input.nextInt();
            System.out.println("insira a "+ (i+1) + "a jogada de "+ player2+ ":");
            int jogada2 = input.nextInt();
            defineVencedor(jogada1, jogada2, player1, player2);  
        }
        if(pontosPlayer1 == pontosPlayer2){
            System.out.println("---------\n EMPATE!");
        }
        else if (pontosPlayer1 > pontosPlayer2){
            System.out.println(player1 + "VENCEU!!!");
        }
        else if (pontosPlayer1 < pontosPlayer2){
            System.out.println(player2 + "VENCEU!!!");
        }
    }
    
    public static void defineVencedor(int jogada1, int jogada2, String player1, String player2){
        if(jogada1 == jogada2){
            System.out.println("EMPATE!!!");
        }
        else if(
                   (jogada1 == 1 && jogada2 == 4)
                || (jogada1 == 1 && jogada2 == 3)
                || (jogada1 == 2 && jogada2 == 1)
                || (jogada1 == 2 && jogada2 == 5)
                || (jogada1 == 3 && jogada2 == 2)
                || (jogada1 == 3 && jogada2 == 4)
                || (jogada1 == 4 && jogada2 == 2)
                || (jogada1 == 4 && jogada2 == 5)
                || (jogada1 == 5 && jogada2 == 3)
                || (jogada1 == 5 && jogada2 == 1)
                ){
            System.out.println("VITÓRIA DO "+ player1);
            pontosPlayer1++;
        }
        else{
            System.out.println("VITÓRIA DO "+ player2);
            pontosPlayer2++;
        }
    }
    
}
