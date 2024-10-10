fun main() {
    val champions: Array<String> = arrayOf("Lewis", "Schummacer", "Max", "Kimi", "Vettel", "Alonso")
    var total = 0
    for (driver in champions) {
        total++
        println("$total.${driver}")
    }
    println("Total: $total")
    println()

    for (value in 0..champions.size - 1) {
        println(value)
        println(champions.get(value))
    }
    println()
    for (value in 55 downTo 0 step 5) {
        println(value)
    }
}