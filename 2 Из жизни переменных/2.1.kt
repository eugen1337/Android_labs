fun main() {
    var numCount: Int = readln().toInt()

    var currentNum: Int = 2
    while (numCount > 0) {
        if (isSimple(currentNum)) {
            println(currentNum)
            numCount--
        }
        currentNum++
    }
}

fun isSimple(num: Int): Boolean {
    for (i in 2..num / 2) {
        if (num % i == 0) return false
    }
    return true
}