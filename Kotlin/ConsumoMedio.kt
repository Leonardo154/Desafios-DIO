import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    val x: Int = leitor.nextInt();
    val y: Double = String.format("%.1f", leitor.nextDouble()).toDouble();
    var media: Double = 0.0;
    
    if(y > 0.0){
      media = x / y;
    }

    println(String.format("%.3f km/l", media));
}