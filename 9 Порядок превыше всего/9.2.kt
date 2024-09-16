import kotlin.math.pow

fun main() {
    val time = "01:20:12"
    println(
        time
            .split(":")
            .map { it.toDouble() }
            .reduceRightIndexed { index, el, acc ->
                acc + el.toDouble() * 60.0.pow(2 - index)
            }
    )
}