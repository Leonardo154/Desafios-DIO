using System;

class Numbers
{
    public static void Main()
    {
        double a, b = 0, avg;
        int postive = 0;

        for (int i = 0; i < 6; i++)
        {
            a = double.Parse(Console.ReadLine());
            if (a > 0)
            {
                b += a;
                postive += 1;
            }
        }
        avg = Math.Round((b / postive), 1);
        Console.WriteLine("{0} valores positivos", postive);
        Console.WriteLine("{0}", avg.ToString("0.0"));

        Console.ReadLine();
    }
}