fun main(args: Array<String>) {
    
    var sum = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12) }
    
    for (i in 0 until 12) {
        for (j in 0 until 12) {
            M[i][j] = readLine()!!.toDouble()
        }
    }
    
    for (x in 0..10) {
        for (y in (x + 1)..11) {
           sum += M[x][y]
        }
    }

    
    if (T == "M") sum /= (144 - 12) / 2
    println(sum.format(1))
}

private fun Double.format(digits: Int) = "%.${digits}f"
        .format(this).replace(',','.')