
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int identificador, qntd;
        float valorUnitario, valorTotal;
        Scanner input = new Scanner(System.in);
        

        System.out.println("Digite o identificador do produto: ");
        identificador = Integer.valueOf(input.nextLine());

        System.out.println("Digite a qntd do produto: ");
        qntd = Integer.valueOf(input.nextLine());

        System.out.println("Digite o valor do produto: ");
        valorUnitario = Float.parseFloat(input.nextLine());
        
        valorTotal= valorUnitario * qntd;
       
        System.out.println("O produto identificador " + identificador + " vale R$" + valorTotal);

    }

}