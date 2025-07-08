using System;

internal class Program
{
    static void Main(string[] args)
    {
        string escolha;
        int numeroDeProdutos;

        do
        {
            Console.WriteLine("Digite 1 para fazer um pedido ou 0 para encerrar o programa");
            escolha = Console.ReadLine();

            switch (escolha)
            {

                case 1:
                    Console.WriteLine("quantos produtos deseja comprar?");
                    numeroDeProdutos = Convert.ToInt32(Console.ReadLine());

                    for (int i = 0; i < numeroDeProdutos; i++)
                    {
                        Compra();
                    }

                    break;

                case 0:
                    break;

                default:
                    Console.WriteLine("Opção Invalida, tente novamente");

            }
            while (escolha != 0) ;
        }
    }

    static double CalculoDeCompra(int quantidade, double valorUnitario)
    {

        double valorTotal = quantidade * valorUnitario;

        return valorTotal;
    }


    static void Compra()
    {

        int id, quantidade;
        double valorUnitario, valorTotal;

        Console.WriteLine("qual o id do item ")
            id = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("qual a quantidade do item " + id)
            quantidade = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("qual o preço do item " + id)
            valorUnitario = Convert.ToDouble(Console.ReadLine());

        valorTotal = CalculoDeCompra(quantidade, valorUnitario);

        Console.WriteLine("O produto" + id + "custa R$" + valorTotal);
    }

}




    

