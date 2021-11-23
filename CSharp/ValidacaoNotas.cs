using System;

class ValidacaoNotas
{
    static void Main()
    {

        bool running = true;

        while (running == true)
        {

            bool isValidNotes = false;

            double n1 = double.Parse(Console.ReadLine());
            double n2 = double.Parse(Console.ReadLine());

            while (isValidNotes == false)
            {
                if (n1 < 0 || n1 > 10)
                {
                    Console.WriteLine("nota invalida");
                    n1 = double.Parse(Console.ReadLine());
                }
                else if (n2 < 0 || n2 > 10)
                {
                    Console.WriteLine("nota invalida");
                    n2 = double.Parse(Console.ReadLine());
                }
                else
                {
                    isValidNotes = true;
                }
            }

            double media = (n1 + n2) / 2;
            Console.Write("media = ");
            Console.WriteLine(media.ToString("N2"));

            bool repeat = true;

            while (repeat == true)
            {
                Console.WriteLine("novo calculo (1-sim 2-nao)");
                int res = int.Parse(Console.ReadLine());

                if (res == 1)
                {
                    repeat = false;
                }
                else if (res == 2)
                {
                    running = false;
                    repeat = false;
                }
            }
        }
    }
}
