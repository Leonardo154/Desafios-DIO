import java.util.Scanner;

fun main(args: Array<String>) {
   //continue o codigo
   val scanner = Scanner(System.`in`);
   val H: Int = scanner.nextInt();
   val P: Int = scanner.nextInt();
    
    val media: Double = H.toDouble() / P.toDouble();
    println(String.format("%.2f", media));
}