import java.util.Scanner;

public class ProblemaII {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salario = 0.0, novoSalario = 0.0, percentual = 0.0;
        System.out.print("Digite o seu salário: ");
        salario = Double.valueOf(input.nextLine());

        if (salario <= 400 && salario >= 0) {
            percentual = 15;
        } else if (salario <= 800) {
            percentual = 12;
        } else if (salario <= 1200) {
            percentual = 10;
        } else if (salario <= 2000) {
            percentual = 7;
        } else {
            percentual = 4;
        }

        novoSalario = salario * (1 + percentual / 100);

        System.out.printf("Você receberá: R$ %.2f (%.0f%%)\n", novoSalario, percentual);
        }
    }
    