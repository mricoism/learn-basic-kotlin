/*
FUNCTION INFIX NOTATION
- Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua data
- Hampir semua operasi matematika adalah infix notation
- Di kotlin, kita bisa membuat function infix notation juga
- Untuk menggunakan function infix notation, tidak wajib menggunakan tanda . (titik)

SYARATNYA
- Harus sebagai function member (akan dibahas di OOP) atau function extension
- Harus memiliki 1 parameter
- Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
*/

fun main():Unit {
    val result: String = "muhammad riko ismail" to "UP"
    println(result)
    println(16 multiBy 55)
}

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

infix fun Int.multiBy(value: Int): Int = this * value
