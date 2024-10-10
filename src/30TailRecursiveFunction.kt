

fun main() {
//    tailRecursive(100_000)
    tailrecFactorialRecursive(value = 10)
}

tailrec fun tailRecursive(value: Int) {
    println(value)
    if (value > 0) {
        tailRecursive(value - 1)
    }
}

tailrec fun tailrecFactorialRecursive(value: Int, total: Int = 1): Int {
    println(total)
    return when (value) {
        1 -> 1
        else -> tailrecFactorialRecursive(value - 1,total * value)
    }
}