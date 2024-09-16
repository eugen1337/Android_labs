fun main() {
    val numsArray: Array<Int> = arrayOf(1, 2, 1, 3, 1, 6)

    var mult: Int = 1
    var min: Int = numsArray[0]
    var max: Int = min


    println("for loop")
    for (i in numsArray.indices) {
        if (numsArray[i] > max)
            max = numsArray[i]
        if (numsArray[i] < min)
            min = numsArray[i]
        mult *= numsArray[i]
    }
    println("min = $min, max = $max, multiple = $mult")
    println("-------------------")

    println("while loop")
    min = numsArray[0]
    max = numsArray[0]
    mult = 1

    var j = numsArray.size - 1
    while (j > 0) {
        if (numsArray[j] > max)
            max = numsArray[j]
        if (numsArray[j] < min)
            min = numsArray[j]
        mult *= numsArray[j]
        j--
    }
    println("min = $min, max = $max, multiple = $mult")
    println("-------------------")

    println("reduce")
    min = numsArray[0]
    max = numsArray[0]
    mult = 1

    mult = numsArray.reduce { a, b -> a * b }
    min = numsArray.reduce { a, b -> if (a > b) b else a }
    max = numsArray.reduce { a, b -> if (a < b) b else a }


    println("min = $min, max = $max, multiple = $mult")
    println("-------------------")

    println("min() & max()")
    min = numsArray.min()
    max = numsArray.max()

    println("min = $min, max = $max, multiple = $mult")
    println("-------------------")
}