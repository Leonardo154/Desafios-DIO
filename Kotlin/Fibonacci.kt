fun main() {
    val N = mutableListOf<Int>()
    
    val x = readLine()!!.toInt()
    
    for(i in 0 until x){
        if( i < 2){
            N.add(i)
        }else{
            N.add(N[i - 1] + N[i - 2])
        }
        print("${N[i]} ")
    }    
}