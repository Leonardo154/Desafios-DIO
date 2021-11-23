fun main(args: Array<String>) {

    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F
    
    if (r <= 2000) {
        i = 0F
    } else if (r > 2000 && r <= 3000) {
        i = (r - 2000) * 8/100
    } else if (r > 3000 && r <= 4500) {
        i = ((r - 3000) * 18/100) + 80
    } else if (r > 4500) {
        i = ((r - 4500) * 28/100) + 350
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")    
}