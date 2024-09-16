fun main() {
    // для Car
    val car1 = Car("Lada", 100)
    val car2 = Car("Lada", 100)

    println("car1 == car2 = ${car1 == car2}")
    println("car1 hash code = ${car1.hashCode()}")
    println("car2 hash code = ${car2.hashCode()}\n")

    val car3 = car1

    println("car1 == car3 = ${car1 == car3}")
    println("car1 === car3 = ${car1 === car3}")
    println("car1 hash code = ${car1.hashCode()}")
    println("car3 hash code = ${car3.hashCode()}\n")

    car3.name = "Belaz"

    println("car1.name = ${car1.name}")
    println("car3.name = ${car3.name}\n")
    // По итогу видим что car1 и car3 идентичны, ведь car3 просто скопировал ссылку на car1
    // Поведение неудивительное, дефолт для ссылочных данных

    // для Vehicle
    val vehicle1 = Vehicle("Ural", 100)
    val vehicle2 = Vehicle("Ural", 100)

    println("vehicle1 == vehicle2 = ${vehicle1 == vehicle2}")
    println("vehicle1 === vehicle2 = ${vehicle1 === vehicle2}")
    println("vehicle1 hash code = ${vehicle1.hashCode()}")
    println("vehicle2 hash code = ${vehicle2.hashCode()}\n")

    val vehicle3 = vehicle1.copy("ZIL")
    val vehicle4 = vehicle1.copy()

    println("vehicle1 == vehicle3 = ${vehicle1 == vehicle3}")
    println("vehicle1 === vehicle3 = ${vehicle1 === vehicle3}")
    println("vehicle1 == vehicle4 = ${vehicle1 == vehicle4}")
    println("vehicle1 === vehicle4 = ${vehicle1 === vehicle4}")

    println("vehicle1 hash code = ${vehicle1.hashCode()}")
    println("vehicle3 hash code = ${vehicle3.hashCode()}")
    println("vehicle4 hash code = ${vehicle4.hashCode()}\n")

    vehicle3.name = "Belaz"

    println("vehicle1.name = ${vehicle1.name}")
    println("vehicle3.name = ${vehicle3.name}\n")

    // data class переопределяет функцию сравнения isEquals(), из-за этого vehicle1 == vehicle
    // но оператор сравнения по ссылке (===) говорит, что это разные ссылки
}

class Car(var name: String, var speed: Int) {

}

data class Vehicle(var name: String, var speed: Int) {

}