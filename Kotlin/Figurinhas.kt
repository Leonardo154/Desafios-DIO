fun main(args: Array<String>) {
    
    val list = mutableListOf<Int>()
    
    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        val (n1, n2) = input
        val result: Int = mdc(n1, n2)
        list.add(result) 
    }

    list.forEach{println(it)}
}


fun mdc(_n1: Int, _n2: Int): Int {

    var remaining: Int
    var n1: Int = _n1
    var n2: Int = _n2

    do {
        remaining = n1 % n2

        n1 = n2
        n2 = remaining

    } while (remaining != 0)

    return n1   
}