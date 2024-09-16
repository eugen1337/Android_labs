fun main() {
    var inputNum: Int = readln().toInt()
    var count: Int = 0
    var sum: Int = inputNum

    while (inputNum != 0) {
        inputNum = readln().toInt()
        count += 1
        sum += inputNum
    }

    println("count = $count, sum = $sum, avg = ${sum.toFloat() / count.toFloat()}")
}
