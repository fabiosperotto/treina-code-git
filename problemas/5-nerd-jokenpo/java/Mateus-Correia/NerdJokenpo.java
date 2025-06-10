import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class NerdJokenpo {

    private static final List<String> OPCOES_VALIDAS = Arrays.asList("pedra", "papel", "tesoura", "lagarto", "spock");

    public static void main(String[] args) {
        //número de partidas
        String numPartidasStr = JOptionPane.showInputDialog(null,
                "Bem-vindo ao Nerd Jokenpô!\nDigite o número de partidas:",
                "Nerd Jokenpô - Início",
                JOptionPane.QUESTION_MESSAGE);

        // Verifica se o usuário cancelou a entrada do número de partidas
        if (numPartidasStr == null) {
            JOptionPane.showMessageDialog(null, "Jogo cancelado.", "Nerd Jokenpô", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int numPartidas;
        try {
            numPartidas = Integer.parseInt(numPartidasStr);
            if (numPartidas <= 0) {
                JOptionPane.showMessageDialog(null,
                        "O número de partidas deve ser um inteiro positivo.",
                        "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Entrada inválida para o número de partidas. Por favor, insira um número.",
                    "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }

        List<String> resultadosFinais = new ArrayList<>();

        // número de partidas
        for (int i = 0; i < numPartidas; i++) {
            String tituloPartida = "Partida " + (i + 1) + " de " + numPartidas;
            String samEscolha, karenEscolha;

            // Obter a escolha de Sam com validação
            while (true) {
                samEscolha = JOptionPane.showInputDialog(null,
                        tituloPartida + "\nEscolha de Sam:\n(pedra, papel, tesoura, lagarto, spock)",
                        "Escolha de Sam",
                        JOptionPane.QUESTION_MESSAGE);

                if (samEscolha == null) { 
                    JOptionPane.showMessageDialog(null, "Jogo cancelado.", "Nerd Jokenpô", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                samEscolha = samEscolha.trim().toLowerCase(); 
                if (OPCOES_VALIDAS.contains(samEscolha)) {
                    break; 
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Escolha inválida para Sam: '" + samEscolha + "'.\nOpções válidas: " + String.join(", ", OPCOES_VALIDAS) + ".",
                            "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                }
            }

            while (true) {
                karenEscolha = JOptionPane.showInputDialog(null,
                        tituloPartida + "\nEscolha de Karen:\n(pedra, papel, tesoura, lagarto, spock)",
                        "Escolha de Karen",
                        JOptionPane.QUESTION_MESSAGE);

                if (karenEscolha == null) { 
                    JOptionPane.showMessageDialog(null, "Jogo cancelado.", "Nerd Jokenpô", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                karenEscolha = karenEscolha.trim().toLowerCase(); 
                if (OPCOES_VALIDAS.contains(karenEscolha)) {
                    break; 
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Escolha inválida para Karen: '" + karenEscolha + "'.\nOpções válidas: " + String.join(", ", OPCOES_VALIDAS) + ".",
                            "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                }
            }

           
            String resultadoPartida = determinarVencedor(samEscolha, karenEscolha);
            resultadosFinais.add(resultadoPartida);
        }

        if (!resultadosFinais.isEmpty()) {
            StringBuilder outputMessage = new StringBuilder();
            for (int i = 0; i < resultadosFinais.size(); i++) {
                outputMessage.append(resultadosFinais.get(i));
                if (i < resultadosFinais.size() - 1) { 
                    outputMessage.append("\n");
                }
            }
            JOptionPane.showMessageDialog(null,
                    outputMessage.toString(),
                    "Resultados Finais do Nerd Jokenpô",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static String determinarVencedor(String sam, String karen) {
        if (sam.equals(karen)) {
            return "empate";
        }

        // Regras
        if ((sam.equals("tesoura") && (karen.equals("papel") || karen.equals("lagarto"))) ||  
            (sam.equals("papel") && (karen.equals("pedra") || karen.equals("spock"))) ||        
            (sam.equals("pedra") && (karen.equals("lagarto") || karen.equals("tesoura"))) ||    
            (sam.equals("lagarto") && (karen.equals("spock") || karen.equals("papel"))) ||      
            (sam.equals("spock") && (karen.equals("tesoura") || karen.equals("pedra")))) {     
            return "sam";
        } else {
            return "karen";
        }
    }
}
