fun main() {
    val nums = NumArray2(doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, -5.0))

    println(nums.newArr().joinToString(" "))
    println(nums.min())
    println(nums.max())

    println(nums.elSum)
}

class NumArray2(private val array: DoubleArray) {
    val elSum: Double
        get() = array.reduce { a, b -> a + b }

    fun newArr(): DoubleArray {
        var newArray = array.clone()
        for (i in newArray.indices) {
            if (newArray[i].toInt() % 2 == 0) newArray[i] = newArray[i] * 2
            else newArray[i] = newArray[i] * 3
        }

        return newArray
    }

    fun max(): Double {
        return array.max()
    }

    fun min(): Double {
        return array.min()
    }
}