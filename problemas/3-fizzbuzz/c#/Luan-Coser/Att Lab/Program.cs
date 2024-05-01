int n;
//Insere os dados 
Console.WriteLine("Escreva o tamanho da sequencia:");
n = Convert.ToInt16(Console.ReadLine());

//Imprime a sequencia do FIzzBuzz
for (int i = 1; i <= n; i++)
{
    if (i % 3 == 0 && i % 5 == 0)
    {
        Console.WriteLine($"FizzBuzz");
    }
    else if (i % 3 == 0)
    {
        Console.WriteLine($"Fizz");
    }
    else if (i % 5 == 0)
    {
        Console.WriteLine($"Buzz");
    }
    else
    {
        Console.WriteLine(i);
    }

}