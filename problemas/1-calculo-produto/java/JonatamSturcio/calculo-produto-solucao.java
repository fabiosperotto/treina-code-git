 Scanner input = new Scanner(System.in);
        int id, qtd;
        double valor;
       do{
           System.out.println("Informe o ID do produto: ");
           id = Integer.parseInt(input.nextLine());
           
           System.out.println("Informe a quantidade de produtos comprados: ");
           qtd = Integer.parseInt(input.nextLine());
           
           System.out.println("Informe o preço do produto: ");
           valor = Double.parseDouble(input.nextLine().replaceAll(",", "."));
           
           System.out.println("O Produto "+id+" custa R$ "+String.format("%.2f",(qtd*valor))+"\n");
           System.out.println("Deseja realizar uma nova operação? [S/N]: ");
           String op = input.nextLine().toUpperCase();
           if(op.equals("N")){
               return;
           }
       }while(true);