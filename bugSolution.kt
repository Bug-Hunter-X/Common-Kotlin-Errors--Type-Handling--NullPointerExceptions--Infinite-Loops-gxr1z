fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    val average = list.average()
    println(average)
    //Added handling for empty list to avoid exceptions
    val emptyList = emptyList<Int>()
    val emptyListAverage = if (emptyList.isEmpty()) 0.0 else emptyList.average()
    println(emptyListAverage)

    //Example of avoiding infinite loop with a condition check
    var i = 0
    while (i < 10) {
        println(i)
        i++
    }
}