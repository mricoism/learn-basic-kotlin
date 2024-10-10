/*
When Expression itu seperti switch di bahasa pemgrograman lain

- Selain if expression, untuk melakukan percabangan di Kotlin, kita juga bisa menggunakan When Expression
- When expression sangat sederhana dibandingkan if
- Biasanya when expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variable
*/

fun main() {
    val finalExam = 'A'
    when(finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good Job")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Unknown Message")
    }
    println()

    when(finalExam) {
        'A' -> {
            println("DUDE!!!")
            println("YOU GOT THE HIGHEST VALUE EXAM EVER")
        }
        'B' -> {
            println("Good Job")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        'E' -> {
            println("Try Again Next Year")
        }
        else -> println("Unknown Message")
    }
    println()

    val driverNumber = 63
    when(driverNumber) {
        1, 11 -> {
            println("its used by redbull team Max & checo")
        }
        44, 63 -> {
            println("its used by mercedes team lewis & russel")
        }
        else -> {
            println()
        }
    }
    println()

    val driver = "Sainz"
    val champions: Array<String> = arrayOf("Lewis", "Max", "Kimi", "Vettel", "Alonso")
    when(driver) {
        in champions -> {
            println("${driver} is World Champion")
        }
        !in champions -> {
            println("${driver} is NOT World Champion")
        }
    }
    // Digunakan untuk check tipedata, class, dan turunannya
    when(driver) {
        is String -> {
            println("This is string")
        }
        !is String -> {
            println("not a string ")
        }
    }
    println()

    // WHEN Sebagai pengganti if else
    val lapTime = 1.33
    when {
        lapTime <= 1.28 -> println("You are going to Q1")
        lapTime <= 1.30 -> println("You are only going to Q2")
        else -> {
            println("you are eliminated in Q3")
        }
    }
}