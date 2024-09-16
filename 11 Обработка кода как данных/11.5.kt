fun main() {
    val ufo = Ufo(0.0, 0.0)
    messageParse(
        "asdwASDW",
        { step: Int -> ufo.move(Up(step)) },
        { step: Int -> ufo.move(Down(step)) },
        { step: Int -> ufo.move(Left(step)) },
        { step: Int -> ufo.move(Right(step)) })
}

class Ufo(var x: Double, var y: Double) {
    override fun toString(): String {
        return "текущие координаты (${x}, ${y})"
    }

    fun move(command: Commands) {
        when (command) {
            is Up -> {
                y += command.step
                println("Тарелка Рика сместилась вверх на ${command.step}")
            }

            is Down -> {
                y -= command.step
                println("Тарелка Рика сместилась вниз на ${command.step}")
            }

            is Right -> {
                x += command.step
                println("Тарелка Рика сместилась вправо на ${command.step}")
            }

            is Left -> {
                x -= command.step
                println("Тарелка Рика сместилась влево на ${command.step}")
            }

            else -> {}
        }
        println(toString())
    }
}


fun messageParse(
    encryptedMessage: String,
    eventUp: (Int) -> Unit,
    eventDown: (Int) -> Unit,
    eventLeft: (Int) -> Unit,
    eventRight: (Int) -> Unit
) {
    for (char in encryptedMessage) {
        when (char) {
            'a' -> eventLeft(1)
            'A' -> eventLeft(2)
            'd' -> eventRight(1)
            'D' -> eventRight(2)
            'w' -> eventUp(1)
            'W' -> eventUp(2)
            's' -> eventDown(1)
            'S' -> eventDown(2)
        }
    }
}

sealed class Commands {}

data class Up(var step: Int) : Commands()
data class Down(var step: Int) : Commands()
data class Right(var step: Int) : Commands()
data class Left(var step: Int) : Commands()
