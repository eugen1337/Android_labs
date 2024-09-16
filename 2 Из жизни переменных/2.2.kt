fun main() {
    val numsArray: Array<Int> = arrayOf(1, 2, 1, 3, 1, 6)

    println("for loop")
    for (i in 1..<numsArray.size - 1) {
        if (numsArray[i - 1] <= numsArray[i] && numsArray[i + 1] <= numsArray[i])
            println(numsArray[i])
    }
    println("-------------------")

    println("while loop")
    var j = numsArray.size - 2
    while (j > 0) {
        if (numsArray[j - 1] <= numsArray[j] && numsArray[j + 1] <= numsArray[j])
            println(numsArray[j])
        j--
    }
    println("-------------------")

    println("forEach")
    numsArray.forEachIndexed { index, value ->
        if (index > 0 && index < numsArray.size - 1) {
            if (value > numsArray[index - 1] && value > numsArray[index + 1]) {
                println(value)
            }
        }
    }
    println("-------------------")
}