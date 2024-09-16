import kotlin.math.sqrt

fun main() {
    quadraticRoot(1F,-2F,-3F)
    quadraticRoot(-1F,-2F,15F)

    // D == 0
    quadraticRoot(1F,12F,36F)

    // D < 0
    quadraticRoot(5F,3F,7F)
}

fun sqr(n: Float): Float {
    return n * n
}

fun discriminant(a: Float, b: Float, c: Float): Float {
    return sqr(b) - 4 * a * c
}

fun rootsNumber(a: Float, b: Float, c: Float): Int {
    val dicscr = discriminant(a, b, c)

    return when {
        dicscr < 0 -> 0
        dicscr > 0 -> 2
        else -> 1
    }
}

fun quadraticRoot(a: Float, b: Float, c: Float) {
    val dicscr = discriminant(a, b, c)
    val count = rootsNumber(a, b, c)

    when {
        count == 0 -> println("В действительных числах корней нет")
        count == 1 -> println("x = ${-b / 2 / a}")
        count == 2 -> println("x1 = ${(-b + sqrt(dicscr)) / 2 / a}, x2 = ${(-b - sqrt(dicscr)) / 2 / a}")
    }
}
