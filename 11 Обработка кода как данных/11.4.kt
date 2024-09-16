fun main() {
    messageParse(
        "abxbbznmfkYyyxX",
        { println("обнаружен символ x") },
        { println("обнаружен символ y") },
        { println("обнаружен символ z") }
    )
}

fun messageParse(message: String, eventX: () -> Unit, eventY: () -> Unit, eventZ: () -> Unit) {
    for (char in message.lowercase()) {
        when (char) {
            'x' -> eventX()
            'y' -> eventY()
            'z' -> eventZ()
        }
    }
}