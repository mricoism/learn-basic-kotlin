/*
RETURN IF & WHEN
- Kadang salam sebuah function, kita sering menggunakan If expression atau when expression, lalu di dalam blok nya kita mengembalikan nilai untuk sebuah function
- Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika ingin mengembalikan nilai dalam if atau when
*/

fun main() {
    println(boxWaterOntrack("Drizzling"))
    println(finishPoint(5))
}

fun boxWaterOntrack(weather: String): String {
    return if (weather == "Drizzling") {
        "Box mate for Intermediate tires, track is not to wet at the moment"
    } else {
        "Box mate, expect heavy rain so we change wet tires"
    }
}
fun finishPoint(position: Int): Int {
    return when (position) {
        1 -> 25
        2 -> 18
        3 -> 15
        4 -> 12
        5 -> 10
        6 -> 8
        7 -> 6
        8 -> 4
        9 -> 2
        10 -> 1
        else -> 0
    }
}

