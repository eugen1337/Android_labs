import kotlin.math.sqrt

fun main() {
    val vector1 = Vector(1.0, 2.0, 3.0)
    val vector2 = Vector(1.0, 2.0, 3.0)

    println(vector1.calcLen())
    // infix
    println(vector1 scalarMult vector2)
    // operator overload
    println(vector1 * vector2)
    // global func
    println(scalarMult(vector1, vector2))
}

class Vector(var x: Double, var y: Double, var z: Double) {
    fun calcLen(): Double {
        return sqrt(x * x + y * y + z * z)
    }

    infix fun scalarMult(vector: Vector): Double {
        return this.x * vector.x + this.y * vector.y + this.z + vector.z
    }

    operator fun times(vector: Vector): Double {
        return scalarMult(vector)
    }
}

fun scalarMult(vector1: Vector, vector2: Vector): Double {
    return vector1 * vector2
}