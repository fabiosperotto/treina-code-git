package fizzbuzz;

/**
 * @author bernardommecabo
 */
public class FizzBuzz {

    public String output() {
        // Cria uma StringBuilder para armazenar o resultado
        StringBuilder resultado = new StringBuilder();
        
        // Loop de 1 a 100
        for (int i = 1; i <= 100; i++){
            String y = "";

            // Verifica se o número é divisível por 3 e 5
            if (i % 3 == 0 && i % 5 == 0) {
                y = "FizzBuzz";
            } else {
                // Verifica se o número é divisível por 3 e atribui "fizz"
                if (i % 3 == 0) {
                    y += "fizz";
                }
                // Verifica se o número é divisível por 5 e atribui "buzz"
                if (i % 5 == 0) {
                    y += "buzz";
                }
                }
                if (y.isEmpty()) {
                y = String.valueOf(i);
                }

                resultado.append(y).append("\n");
        }

        return resultado.toString();
    }
}
