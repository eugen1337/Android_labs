package `10 На каждый вход знай свой выход`

fun main() {
    println("Начало Main")
    Thread {
        imitationTwo()
        imitationOne()
    }.start()
    println("Конец Main")

    // Тут уже два потока, в первом выполняется вывод на экран конец и начало main
    // во втором синхронно выполняются функции

    // так как функции выполняются в отдельном потоке, еще и с задержкой,
    // вывод о main выводиться в начале консоли
}
