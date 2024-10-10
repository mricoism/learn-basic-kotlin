fun main() {
    val range1 = 3..73 step 7
    println(range1)
    println(range1.count())
    println(range1.contains(73))
    println(range1.contains(77))
    println("First: ${range1.first}")
    println("Last: ${range1.last}")
    println(range1.step)
    println()

    val range2 = 73..10 // This range is empty. Did you mean to use 'downTo'?
    println(range2)
    println(range2.count())
    println(range2.contains(73))
    println(range2.contains(55))
    println("First: ${range2.first}")
    println("Last: ${range2.last}")
    println(range2.step)
    println()

    val range3 = 77 downTo 18
    println(range3)
    println(range3.count())
    println(range3.contains(73))
    println(range3.contains(55))
    println("First: ${range3.first}")
    println("Last: ${range3.last}")
    println(range3.step)
    println()


}