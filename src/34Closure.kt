/*
CLOSURE
- Closure adalah kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data-data disekitarnya dalam scope yang sama
- Harap gunakan fitur closure ini dengan bijak saat kita membuat aplikasi
 */

fun main() {
    var counter: Int = 0
    val lambdaIncrement: () -> Unit = {
        println("lambdaIncrement")
        counter++
    }
    val anonymousIncrement = fun() {
        println("anonymousIncrement")
        counter++
    }
    fun functionIncrement() {
        println("functionIncrement")
        counter++
    }

    println("Before: $counter")
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    println("After: $counter")
}