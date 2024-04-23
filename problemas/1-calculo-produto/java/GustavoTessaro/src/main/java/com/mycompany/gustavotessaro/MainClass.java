
package com.mycompany.gustavotessaro;

import javax.swing.JOptionPane;

public class MainClass {

    public static void main(String[] args) {
        
        int repetir = 0;
        String[] options = {"Sim", "Não"};
        
        while(repetir == 0){
            int verifica = 0;
            int quantidade = 0;
            float preco = 0;
            int id = 0;

            while(verifica == 0){
                try {
                    String teste = JOptionPane.showInputDialog(null, "Digite o ID do Produto: ");

                    if(teste == null){
                        System.exit(0);
                    }
                    
                    id = Integer.parseInt(teste);
                    verifica = 1;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite apenas números inteiros!");
                    verifica = 0;
                }
            }

            verifica = 0;
            
            while(verifica == 0){
                try {
                    String teste = JOptionPane.showInputDialog(null, "Digite a quantidade do Produto ID " + id + ": ");

                    if(teste == null){
                        System.exit(0);
                    }
                    
                    quantidade = Integer.parseInt(teste);
                    verifica = 1;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite apenas números inteiros!");
                    verifica = 0;
                }
            }

            verifica = 0;
            
            while(verifica == 0){
                    try {
                    String teste = JOptionPane.showInputDialog(null, "Digite o preço do Produto ID" + id + ": ");

                    if(teste == null){
                        System.exit(0);
                    }
                    
                    preco = Float.parseFloat(teste);
                    verifica = 1;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite apenas números!");
                    verifica = 0;
                }
            }

            float total = preco * quantidade;

            JOptionPane.showMessageDialog(null, "O produto ID" + id + " custa R$" + total);
            repetir = JOptionPane.showOptionDialog(null, "Deseja ler mais um código de produto?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        }
        
    }
    
}
