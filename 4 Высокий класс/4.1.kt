fun main() {
    val nums = NumArray(doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, -5.0))

    println(nums.positiveSum())
    println(nums.mult())
    println(nums.avgAriphm())
}

class NumArray(private val array: DoubleArray) {
    fun positiveSum(): Double {
        return array.reduce { a, b -> if (b > 0) a + b else a }
    }

    fun mult(): Double {
        return array.reduce { a, b -> a * b }
    }

    fun avgAriphm(): Double {
        return array.reduce { a, b -> a + b } / array.size
    }
}