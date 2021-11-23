import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    var entrada: Int = scanner.nextInt()
    
    var anos: Int = if(entrada >= 365) entrada / 365 else 0
    var meses: Int = if(entrada - anos * 365 >= 30) (entrada - anos * 365) / 30 else 0
    var dias: Int = if((entrada - anos * 365) - meses * 30 > 0) (entrada - anos * 365) - meses * 30 else 0

    println("${anos} ano(s)")
    println("${meses} mes(es)")
    println("${dias} dia(s)")
}