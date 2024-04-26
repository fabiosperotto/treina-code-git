
    internal class Program
{
    static LinkedList<int> lista = new LinkedList<int>();
    static int par = 0;
    static int impar = 0;
    static void Main(string[] args)
    {
        Console.Write("Informe o valor base para o intervalo: ");
        int a = Convert.ToInt32(Console.ReadLine());

        Console.Write("Informe o valor limite o intervalo: ");
        int b = Convert.ToInt32(Console.ReadLine());

        while (true)
        {
            Console.Write("Informe um numero qualquer: ");
            int x = Convert.ToInt32(Console.ReadLine());

            if (x >= a && x <= b)
            {
                lista.AddFirst(x);
            }

            if (x == 0) break;
        }
        Contador();

        Console.Write($"\nPara o intervalo {a} e <= {b} existem {par} numeros pares  e {impar} numeros impares.\n");
        Console.Write("\nenter para finalizar...");
        Console.ReadLine();
    }

    static void Contador()
    {
        foreach (int x in lista)
        {
            if ((x % 2) == 0)
            {
                par++;
            }
            else
            {
                impar++;
            }
        }
    }
}

