fun main() {
    val W = readLine()!!.toInt()
    var K = 0
    val M = mutableListOf<Array<Int>>()
    for (A in 1..W-2)
        loop@ for (B in 1..W-A-1) {
            val C = W-A-B
            val E = arrayOf(A,B,C)//.sortedArray()
            for (m in M) {
                //if (m contentEquals E) continue@loop
            }
            M.add(E)
            K++
        }
    println(K)


    M.forEach {
        it.forEach {
            print(" " + it)
        }
        println()
    }
}




// FULL

fun main() {
    val L = readLine()!!.toInt()
    val R = readLine()!!.toInt()

    var W = 3
    var K = 0
    while (true) {
        val C = combo(W)
        if (C > R) break
        if (C in L..R) K++
        //if (C in L..R) print(" $W")
        //println("$W -> $C")
        W++
    }
    print(K)
}

fun combo(W: Int): Int {
    var K = 0
    val M = mutableListOf<Array<Int>>()
    for (A in 1..W-2)
        loop@ for (B in 1..W-A-1) {
            val C = W-A-B
            val E = arrayOf(A,B,C).sortedArray()
            for (m in M) {
                if (m contentEquals E) continue@loop
            }
            M.add(E)
            K++
        }
    return K
}
