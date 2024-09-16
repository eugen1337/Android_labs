package `10 На каждый вход знай свой выход`

fun main() {
    println("Начало Main")

    Thread {
        imitationTwo1()
    }.start()

    Thread {
        imitationOne1()
    }.start()

    println("Конец Main")

    // теперь каждая функция в своем потоке и все происходит асинхронно
    // сообщения мейна выводятся как и раньше в самом начале

    // функция у которой больше Tread.sleep очевидно дольше выполняется
}

fun imitationOne1() {
    for (i in 1..10) {
        Thread.sleep(500)
        println("One $i")
    }
}

fun imitationTwo1() {
    for (i in 1..10) {
        Thread.sleep(300)
        println("Two $i")
    }
}