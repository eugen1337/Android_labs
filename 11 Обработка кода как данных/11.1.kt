fun main() {
    val fahrenheit = { temp: Int -> (temp * 9 / 5) + 32 }
    // 0°C
    println(fahrenheit(0).toString() + "°F")
}
