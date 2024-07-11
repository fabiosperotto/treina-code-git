package jokenpo_nerd;

import java.util.Scanner;
import java.util.Random;

public class Jokenpo_Nerd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoJogador, opcaoJogo, quantJogadorGanhou=0, quantJogoGanhou=0;
        System.out.println("Qual opcao voce quer jogar?(Digite o numero da opcao)");
        
        while(quantJogadorGanhou!=5){
            System.out.println("0.Spok\n1.Tesoura\n2.Papel\n3.Pedra\n4.Lagarto");
            opcaoJogador = Integer.valueOf(input.nextLine());

            opcaoJogo = (int) (Math.random()*4);
            
            if(opcaoJogador==0){ //Spok
                System.out.print("Spok     vs");
                if(opcaoJogo==1){ //Tesoura
                    System.out.println("    Tesoura");
                    System.out.println("Você Ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==3){ //Pedra
                    System.out.println("    Pedra");
                    System.out.println("Você Ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==2){ //Papel
                    System.out.println("    Papel");
                    System.out.println("Você Perdeu!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==4){ //Lagarto
                    System.out.println("    Lagarto");
                    System.out.println("Você Perdeu!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==0){ //Spok
                    System.out.println("    Spok");
                    System.out.println("Empate!");
                }
            }
            if(opcaoJogador==1){ //Tesoura
                System.out.print("Tesoura     vs");
                if(opcaoJogo==0){ //Spok
                    System.out.println("    Spok");
                    System.out.println("Você Perdeu!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==3){ //Pedra
                    System.out.println("    Pedra");
                    System.out.println("Você Perdeu!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==2){ //Papel
                    System.out.println("    Papel");
                    System.out.println("Você Ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==4){ //Lagarto
                    System.out.println("    Lagarto");
                    System.out.println("Você Ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==1){ //Tesoura
                    System.out.println("    Tesoura");
                    System.out.println("Empate!");
                }
            }
            if(opcaoJogador==2){ //Papel
                System.out.print("Papel     vs");
                if(opcaoJogo==1){ //Tesoura
                    System.out.println("    Tesoura");
                    System.out.println("Você Perdeu!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==3){ //Pedra
                    System.out.println("    Pedra");
                    System.out.println("Você Ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==0){ //Spok
                    System.out.println("    Papel");
                    System.out.println("Você Ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==4){ //Lagarto
                    System.out.println("    Lagarto");
                    System.out.println("Você Perdeu1!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==2){ //Papel
                    System.out.println("    Papel");
                    System.out.println("Empate!");
                }
            }
            if(opcaoJogador==3){ //Pedra
                System.out.print("Pedra     vs");
                if(opcaoJogo==1){ //Tesoura
                    System.out.println("    Tesoura");
                    System.out.println("Você ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==0){ //Spok
                    System.out.println("    Spok");
                    System.out.println("Você Perdeu!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==2){ //Papel
                    System.out.println("    Papel");
                    System.out.println("Você Perdeu!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==4){ //Lagarto
                    System.out.println("    Lagarto");
                    System.out.println("Você Ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==3){ //Pedra
                    System.out.println("    Pedra");
                    System.out.println("Empate!");
                }
            }
            if(opcaoJogador==4){ //Lagarto
                System.out.print("Lagarto     vs");
                if(opcaoJogo==1){ //Tesoura
                    System.out.println("    Tesoura");
                    System.out.println("Você Perdeu!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==3){ //Pedra
                    System.out.println("    Pedra");
                    System.out.println("Você Perdeu!");
                    quantJogoGanhou++;
                }else if(opcaoJogo==2){ //Papel
                    System.out.println("    Papel");
                    System.out.println("Você Ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==0){ //Spok
                    System.out.println("    Spok");
                    System.out.println("Você Ganhou!");
                    quantJogadorGanhou++;
                }else if(opcaoJogo==4){ //Lagarto
                    System.out.println("    Lagarto");
                    System.out.println("Empate!");
                }
            }
            if(opcaoJogador>4 || opcaoJogador<0){
                System.out.println("Essa não é uma opção!");
            }
            
            System.out.println("");
            System.out.println("Voce:"+quantJogadorGanhou+", Computador:"+quantJogoGanhou);
            System.out.println("");
            
            if(quantJogoGanhou==5)
                break;
        }
        
        if(quantJogadorGanhou==5){
            System.out.println("\nVocê é um Vencedor!");
        }else if(quantJogoGanhou==5){
            System.out.println("\nVocê é um Perdedor!");
        }
    }
    
}
