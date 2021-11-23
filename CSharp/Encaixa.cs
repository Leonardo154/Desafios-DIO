using System;

class Encaixa
{
    static void Main(string[] args)
    {
        int qt = int.Parse(Console.ReadLine());
        for (int i = 0; i < qt; i++)
        {
            string[] v = Console.ReadLine().Split(" ");
            string a = v[0];
            string b = v[1];

            bool encaixa = false;

            if (b.Length > a.Length)
            {
                encaixa = false;
            }
            else
            {
                for (int n = 0; n < b.Length; n++)
                {
                    if (b[b.Length - 1 - n] == a[a.Length - 1 - n])
                    {
                        encaixa = true;
                    }
                    else
                    {
                        encaixa = false;
                        break;
                    }
                }
            }

            if (encaixa)
            {
                Console.WriteLine("encaixa");
            }
            else
            {
                Console.WriteLine("nao encaixa");
            }
        }
    }
}
