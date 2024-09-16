fun main() {
    val numberStr: String = readln()
    println(numberStr.first().digitToInt() + numberStr.last().digitToInt())
}