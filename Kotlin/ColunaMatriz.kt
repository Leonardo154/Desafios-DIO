fun main(args: Array<String>) {

    val C = readLine()!!.toInt() 
    var sum = 0.0 
    val T = readLine()!!.toUpperCase() 
    val M = Array(12) { DoubleArray(12) } 
    var read: String 
 
    for (i in 0..11) {
 
        for (j in 0..11) {
 
            read = readLine()!!
 
            try { 
                M[i][j] = read.toDouble() 
            } catch (e: Exception) {
                 M[i] = read.split(" ").map(String::toDouble).toDoubleArray() 
                break; 
            } 
        } 
    } 
 
    for (k in 0.until(M.size)) { 
        sum += M[k][C] 
    }
 
    if (T == "M") sum /= M.size

    println(sum.format(1)) 
 } 
 
 private fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',', '.')