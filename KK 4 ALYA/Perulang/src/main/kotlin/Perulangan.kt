fun main(args: Array<String>) {
    println("input : ")
    var input = readln().toInt()
    println("batas : ")
    var batas = readln().toInt()

    for (i in input..batas) {
        var prima = true
        for (j in 2 until i) {
            if (i % j == 0) {
                prima = false
                break
            }
        }
        if (prima && i > 1){
            print(" ${i}")
        }
    }
}





