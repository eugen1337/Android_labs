fun main() {
    val numbers = listOf(-1, 0, 2, 3)
    // 1
    var filteredList = numbers.filter { it < 0 }
    println(filteredList)
    // 2
    filteredList = numbers.map { if (it > 0) -it else it }
    println(filteredList)
    // 3
    filteredList = numbers.map { it * it }
    println(filteredList)
    // 4
    val nums = (1..7).toList()
    println(nums.joinToString("+", "=", "="))
    // 5
    val phoneBook = mapOf("Name1" to "+1-234", "Name2" to "+1-233", "Name3" to "+3-21", "Name11" to "+4-32")
    val countryCode = "+1"
    val filteredMap = phoneBook.filter { (key, value) -> value.startsWith(countryCode)}
    println(filteredMap)
}