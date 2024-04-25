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
        System.out.println("digite o numero de jogadas");
        int rodadas = input.nextInt();
        
        for (int i = 0; i < rodadas; i++) {
            
            defineVencedor();  
        }
    }
    
    public static void defineVencedor(){
        
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
        System.out.println("digite ambas as jogadas separadas por um espaço:");
        String jogada = input.nextLine();
        String[] jogadas = jogada.split(" ");
        if(jogadas[0].equalsIgnoreCase(jogadas[1])){
            System.out.println("empate");
        }
        else if(
                   (jogadas[0].equalsIgnoreCase("pedra") && jogadas[1].equalsIgnoreCase("lagarto"))
                || (jogadas[0].equalsIgnoreCase("pedra") && jogadas[1].equalsIgnoreCase("tesoura"))
                || (jogadas[0].equalsIgnoreCase("papel") && jogadas[1].equalsIgnoreCase("pedra"))
                || (jogadas[0].equalsIgnoreCase("papel") && jogadas[1].equalsIgnoreCase("spock"))
                || (jogadas[0].equalsIgnoreCase("tesoura") && jogadas[1].equalsIgnoreCase("papel"))
                || (jogadas[0].equalsIgnoreCase("tesoura") && jogadas[1].equalsIgnoreCase("lagarto"))
                || (jogadas[0].equalsIgnoreCase("lagarto") && jogadas[1].equalsIgnoreCase("papel"))
                || (jogadas[0].equalsIgnoreCase("lagarto") && jogadas[1].equalsIgnoreCase("spock"))
                || (jogadas[0].equalsIgnoreCase("spock") && jogadas[1].equalsIgnoreCase("tesoura"))
                || (jogadas[0].equalsIgnoreCase("spock") && jogadas[1].equalsIgnoreCase("pedra"))
                ){
            System.out.println("VITÓRIA DO JOGADOR 1");
        }
        else{
            System.out.println("VITÓRIA DO JOGADOR 2");
        }
    }
    
}
