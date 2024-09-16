fun main() {
    val randomNum: Int = (0..1).random()
    var inputNum: Int = readln().toInt()

    while (randomNum != inputNum) {
        println(if (inputNum < randomNum) "Мало" else "Много")
        inputNum = readln().toInt()
    }

    println("Угадал")
}