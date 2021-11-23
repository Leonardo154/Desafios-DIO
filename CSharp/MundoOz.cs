using System;
using System.Collections.Generic;
using System.Linq;

class MundoOz
{
    static void Main(string[] args)
    {

        List<string> list = new List<string>();

        while (true)
        {
            string jewelry = Console.ReadLine();
            if (string.IsNullOrWhiteSpace(jewelry))
            {
                break;
            }
            else
            {
                list.Add(jewelry);
            }
        }

        IEnumerable<string> diffJewelry = list.Distinct();
        Console.WriteLine(diffJewelry.Count());
    }
}