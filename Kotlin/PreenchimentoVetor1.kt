fun main(args: Array<String>) {

    val v = readLine()!!.toInt()
    val a = IntArray(10).toMutableList()

    a[0] = v
    for (i in 1 until a.size) { a[i] = a[i-1] * 2 }
    for (k in 0 until a.size) { println("N[$k] = ${a[k]}") }
}