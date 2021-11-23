using System;

class TrigoTabuleiro
{
    static void Main(string[] args)
    {
        int qtdTeste = int.Parse(Console.ReadLine());

        for (int i = 0; i < qtdTeste; i++)
        {
            int x = int.Parse(Console.ReadLine());
            double qtdCount = 1;

            for (int n = 1; n <= x; n++)
            {
                qtdCount = (qtdCount * 2);
            }

            qtdCount = Math.Truncate(qtdCount / 12000);
            ulong countFinal = Convert.ToUInt64(qtdCount);

            Console.WriteLine($"{countFinal} kg");
        }
    }
}