fun main() {
    val arr = arrayOf("string", null, "ЕЩЕSsdjgns", null, "NOTnull")
    // if
    arr.forEach { if (it != null) println(it.uppercase()) }
    println()
    // safe call
    arr.forEach { println(it?.uppercase()) }
    println()
    // let
    arr.forEach { it?.let { println(it.uppercase()) } }
    println()
    // elvis
    arr.forEach {  println(it?.uppercase() ?: "empty") }
}