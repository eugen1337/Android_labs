package `10 На каждый вход знай свой выход`

fun main() {
    println("Начало Main")
    imitationTwo()
    imitationOne()
    println("Конец Main")

    // Все инструкции выполняются в одном потоке, синхронно
    // соответственно вывод на экран происходит в порядке, который в коде
}

fun imitationOne() {
    for (i in 1..10) {
        Thread.sleep(300)
        println("One $i")
    }
}

fun imitationTwo() {
    for (i in 1..10) {
        Thread.sleep(300)
        println("Two $i")
    }
}