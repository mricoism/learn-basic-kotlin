/*
BREAK AND CONTINUE
-Break & continue adalah kata kunci yang bisa digunakan dalam semua perulangan di Kotlin
-Break digunakan untuk menghentikan seluruh perulangan
-Continue adalah digunakan untuk menghentikan perulangan yang berjalan, dan langsung melanjutkan ke perulangan selanjutnya
*/

fun main() {
    var i = 0
    while (i <= 10) {
        i++
        if (i % 2 == 0) {
            continue
        }
        println("Perulangan ke-$i")
    }
    println("perulangan pertama selesai")
    println()

    var j = 0
    do {
        if (j == 5) {
            break
        }
        j++
        println("Perulangan ke-$j")
    } while (j < 10)
    println("perulangan kedua selesai")
}