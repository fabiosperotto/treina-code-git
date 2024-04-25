import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema2{

public static void main(String[] args) {
    


    Scanner scanner = new Scanner(System.in);
    float salario = 0;

    System.out.println("Digite o salario (obs: usar virgula para numeros nao inteiros):");
    salario = scanner.nextFloat();

    float percentual = 0;
    float novoSalario = 0;

    if (salario >= 0 && salario <= 400.00) {
        percentual = 15;
    } else if (salario > 400.00 && salario <= 800.00) {
        percentual = 12;
    } else if (salario > 800.00 && salario <= 1200.00) {
        percentual = 10;
    } else if (salario > 1200.00 && salario <= 2000.00) {
        percentual = 7;
    } else if (salario > 2000.00) {
        percentual = 4;
    }

    novoSalario = salario + (salario * (percentual / 100));

    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("Voce recebera: RS " + df.format(novoSalario) + " (" + percentual + "%)");

}
}