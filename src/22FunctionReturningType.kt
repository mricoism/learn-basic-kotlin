/*
FUNCTION RETURN TYPE
- Seperti yang sudah dibahas sebelumnya, bahwa function itu bisa mengembalikan data
- Untuk memberitahu bahwa function mengembalikan data, kita harus menuliskan tipe data kembalian dari function tersebut
- Jika function tersebut kita deklarasikan dengan tipe data pengembalian, maka wajib di dalam function nya kita harus mengembalikan data
- Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return, diikuti dengan datanya
*/

fun main() {
    println("55 + 44 = ${sum(55, 44)}")
    println("16 * 18 = ${multi(16, 18)}")
    println("77 / 3 = ${division(77, 3)}")
}

fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun multi(a: Int, b: Int): Int {
    return a * b
}

fun division(a: Int, b: Int): Int {
    if (a == 0 || b == 0){
        return 0
    } else {
        return a / b
    }
}