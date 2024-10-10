/*
SINGLE EXPRESSION FUNCTION
- Kadang kita sering membuat function yang sangat sederhana
- Misal function yang hanya berisikan kode blok sederhana, misal hanya 1 baris
- Jika kita mengalami hal seperti ini, kita bisa mengubahnya menjadi single expression function
- Single expression function adalah deklarasi function hanya dengan 1 baris kode
- Untuk membuat single expression function, kita hanya butuh tanda = (sama dengan) setelah deklarasi nama function dan tipe data pengembalian function
*/

fun main() {
    println(double(55))
    myTime("SOFT")
}

fun double(a: Int):Int = a * 2
fun myTime(tires: String): Unit = println("Your time with $tires tires is 1.29. Good job mate!")
