/*
FUNCTION SCOPE
- Function scope adalah ruang lingkup dimana sebuah function bisa diakses
- Saat kita membuat function di dalam file kotlin, maka secara otomatis function tersebut bisa diakses dari file kotlin manapun
- Jika kita ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu, maka kita bisa membuat function di dalam function
*/

fun main() {
    boxNow()
}

fun boxNow() {
    println("Box now.. Box!")
    explainStrategy()
//    benefit()
}

fun explainStrategy() {
    println("So we are try to undercut Norris")

    fun benefit() {
        println("We can push to cut the distance with Max then move to front of Norris")
    }
    benefit()
}