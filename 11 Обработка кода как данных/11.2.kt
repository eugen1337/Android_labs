fun main() {
    val concat = { params: Array<String> ->
        val sortedParams = params.sortedArray().joinToString(", ")
        println(sortedParams)
    }
    concat(arrayOf("5xxxxx", "3xxx", "4xxxx", "1x"))
}