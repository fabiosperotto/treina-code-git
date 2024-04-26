using System;

namespace Problema_1___Cálculo_do_produto
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int validacao;
            do
            {
                Console.Clear();

                // Entrada de dados
                Console.WriteLine("---Digite as informações---");
                Console.Write("Código do produto: ");
                int codigo = Convert.ToInt32(Console.ReadLine());

                Console.Write("Quantidade: ");
                int quantidade = Convert.ToInt32(Console.ReadLine());

                Console.Write("Valor unitário: ");
                double valorUnitario = Convert.ToDouble(Console.ReadLine());

                // Cálculo do valor da compra
                double calculoCompra = valorUnitario * quantidade;

                // - Método responsável por arredondar para o inteiro mais proximo.
                var valor = Math.Round(calculoCompra, 2);

                // Saída das informações
                Console.Clear();
                Console.WriteLine("-----------------------------------------");
                Console.WriteLine($"O produto ID {codigo} custa R$ {valor}");
                Console.WriteLine("-----------------------------------------");

                Console.WriteLine("\nDigite '0' para encerrar ou qualquer número inteiro para continuar.");
                validacao = Convert.ToInt32(Console.ReadLine());

            } while (validacao != 0);


        }
    }
}
