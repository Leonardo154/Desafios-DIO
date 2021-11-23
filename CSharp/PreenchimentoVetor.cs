using System;

class PreenchimentoVetor
{
    static void Main(string[] args)
    {
        int valorLido = int.Parse(Console.ReadLine());
        int[] n = new int[10];
        n[0] = valorLido;

        for (int i = 0; i < n.Length; i++)
        {
            if (i == 0)
            {
                Console.WriteLine($"N[0] = {valorLido}");
            }
            else
            {
                n[i] = n[i - 1] * 2;
                Console.WriteLine($"N[{i}] = {n[i]}");
            }
        }
    }
}