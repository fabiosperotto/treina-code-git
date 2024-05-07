using System;
using System.Collections;
using System.Collections.Generic;
using System.Dynamic;
using System.Security.Cryptography.X509Certificates;

namespace vanderluiz
{
    using System;

    class Program
    {
        static void Main(string[] args)
        {
            Console.Clear();
            Console.WriteLine("\nDigite o numero de partidas");
            int numPartidas = int.Parse(Console.ReadLine());
            ArrayList Resultados = new ArrayList();
            for (int i = 0; i < numPartidas; i++)
            {
                
                Console.Clear();
                Console.WriteLine("-------------------------------------");
                Console.ForegroundColor = ConsoleColor.Blue;
                Console.WriteLine("----------------MENU-----------------");
                Console.WriteLine("Escolha alguma das opções abaixo: ");
                Console.WriteLine("pedra");
                Console.WriteLine("papel");
                Console.WriteLine("tesoura");
                Console.WriteLine("lagarto");
                Console.WriteLine("spock");
                Console.WriteLine("--------------------------------------");
                Console.ForegroundColor = ConsoleColor.White;

                System.Console.Write($"Jogada {i + 1} San:  ");
                string sam = Console.ReadLine().ToLower();
                System.Console.Write($"Jogada {i + 1} Karen:  ");
                string karen = Console.ReadLine().ToLower();


                if (sam == karen)
                {
                    Console.WriteLine("empate");
                    Resultados.Add("empate");
                    continue;
                }

                switch (sam)
                {
                    case "pedra":
                        if (karen == "lagarto" || karen == "tesoura")
                            Resultados.Add("Vencedor Sam"); 
                        else
                            Resultados.Add("Vencedora Karen");
                        break;
                    case "papel":
                        if (karen == "pedra" || karen == "spock")
                            Resultados.Add("Vencedor Sam"); 
                        else
                            Resultados.Add("Vencedora Karen");
                        break;
                    case "tesoura":
                        if (karen == "papel" || karen == "lagarto")
                            Resultados.Add("Vencedor Sam"); 
                        else
                            Resultados.Add("Vencedora Karen");
                        break;
                    case "lagarto":
                        if (karen == "spock" || karen == "papel")
                            Resultados.Add("Vencedor Sam"); 
                        else
                            Resultados.Add("Vencedora Karen");
                        break;
                    case "spock":
                        if (karen == "tesoura" || karen == "pedra")
                            Resultados.Add("Vencedor Sam"); 
                        else                            
                            Resultados.Add("Vencedora Karen");
                        break;
                    default:
                        Console.WriteLine("Entrada inválida");
                        break;
                }
            }
            foreach (var item in Resultados)
            {
                System.Console.WriteLine("\n"+ item);
            }
            System.Console.WriteLine("\n");
        }
    }


}
