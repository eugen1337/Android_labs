fun main() {
    val point = Point(0.0, 0.0)
    val turtle = Turtle()

    turtle.move(point, Command.UP)
    println(point)
    turtle.move(point, Command.RIGHT)
    println(point)
    turtle.move(point, Command.DOWN)
    println(point)
    turtle.move(point, Command.LEFT)
    println(point)

}

class Point(var x: Double, var y: Double) {
    override fun toString(): String {
        return "текущие координаты (${x}, ${y})"
    }
}

enum class Command {
    UP, DOWN, LEFT, RIGHT
}

class Turtle() {
    fun move(point: Point, command: Command) {
        when (command) {
            Command.UP -> {
                point.y += 1
                println("Произведено перемещение по оси Х на 0, по оси У на 1")
            }

            Command.DOWN -> {
                point.y -= 1
                println("Произведено перемещение по оси Х на 0, по оси У на -1")
            }

            Command.LEFT -> {
                point.x -= 1
                println("Произведено перемещение по оси Х на -1, по оси У на 0")
            }

            Command.RIGHT -> {
                point.x += 1
                println("Произведено перемещение по оси Х на 1, по оси У на 0")
            }
        }
    }
}