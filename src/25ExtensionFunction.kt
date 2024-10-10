/*
EXTENSION FUNCTION
- Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
- Extension function adalah salah satu fitur yang sangat powerfull, namun harap bijak menggunakannya, karena jika terlalu banyak digunakan, akan membuat program sulit dimengerti, karena terlihat seperti magic
- Untuk membuat extension function, kita cukup menambahkan tipe data pada nama function nya, lalu diikuti dengan tanda . (titik)
- Untuk mengakses data nya di extension function, kita bisa menggunakan kata kunci this
*/

fun main() {
    val name: String = "Riko"
    println(name.hello())
    println(55.multi())
    println(20.devideTwo())
}

fun String.hello(): String {
    return "Hello $this!"
}
fun Int.multi(): Int {
    return this * 2
}
fun Int.devideTwo(): Int = this / 2