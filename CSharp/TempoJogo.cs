using System;

class TempoJogo
{
    public static void Main()
    {
        int a, b, c, d, x, y;
        string[] s = Console.ReadLine().Split(' ');
        int iHour = int.Parse(s[0]);
        int iMin = int.Parse(s[1]);
        int fHour = int.Parse(s[2]);
        int fMin = int.Parse(s[3]);

        TimeSpan start = new TimeSpan(iHour, iMin, 0);
        TimeSpan end = new TimeSpan(fHour, fMin, 0);

        var interval = end - start;

        Console.WriteLine("O JOGO DUROU {0} HORA(S) E {1} MINUTO(S)", interval.Hours, interval.Minutes);

        Console.ReadLine();
    }
}