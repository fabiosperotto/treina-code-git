Scanner scanner = new Scanner(System.in);
Map<String, String> produtos = new HashMap<>();
produtos.put("2024001", "Produto 1");
produtos.put("2024002", "Produto 2");
produtos.put("2024003", "Produto 3");

int opcao;
do {
    System.out.println("Menu:");
    System.out.println("1 - Visualizar produtos");
    System.out.println("2 - Calcular produto");
    System.out.println("3 - Sair");
    System.out.print("Escolha uma opcao: ");
    opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Produtos disponiveis:");
            for (Map.Entry<String, String> entry : produtos.entrySet()) {
                System.out.println(entry.getValue() + " - " + entry.getKey());
            }
            break;
        case 2:
            System.out.println("Digite o codigo do produto: ");
            String codigo = scanner.next();
            if (produtos.containsKey(codigo)) {
                System.out.println("Digite a quantidade do produto: ");
                int quantidade = scanner.nextInt();
                System.out.println("Digite o valor unitario do produto: ");
                double valorUnitario = scanner.nextDouble();
                double valorTotal = quantidade * valorUnitario;
                System.out.printf("O produto ID %s custa R$ %.2f\n", codigo, valorTotal);
            } else {
                System.out.println("Codigo de produto invalido.");
            }
            break;
        case 3:
            System.out.println("Encerrando o programa...");
            break;
        default:
            System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
    }
} while (opcao != 3);

scanner.close();
