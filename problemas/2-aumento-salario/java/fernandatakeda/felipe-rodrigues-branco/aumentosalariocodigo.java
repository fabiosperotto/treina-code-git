Claro, aqui está o código sem os comentários:

```java
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        
        double percentual = 0;
        if (salario <= 400.00) {
            percentual = 15;
        } else if (salario <= 800.00) {
            percentual = 12;
        } else if (salario <= 1200.00) {
            percentual = 10;
        } else if (salario <= 2000.00) {
            percentual = 7;
        } else {
            percentual = 4;
        }
        
        double novoSalario = salario * (1 + percentual / 100);
        
        System.out.printf("Você receberá: R$ %.2f (%.0f%%)\n", novoSalario, percentual);
        
        scanner.close();
    }
}
```
