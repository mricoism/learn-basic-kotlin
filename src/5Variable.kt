
/*
VARIABLE (MUTABLE & IMMUTABLE)
-Variable adalah tempat untuk menyimpan data
-Kotlin mendukung 2 jenis variabel; Mutable (bisa diubah) dan Immutable (tidak bisa diubah).
-Untuk membuat variable Mutable, di kotlin bisa menggunakan kata kunci var
-Untuk membuat variable Immutable, di kotlin bisa menggunakan kata kunci val

Direkomendasikan menggunakan Immutable dibanding Mutable data

NULLABLE
Secara standar, variable di Kotlin harus dideklarasikan / diinisialisasikan nilai nya
Jika saat membuat variable, tidak diberi nilai, maka akan error
Kotlin mendukung variable yang boleh null (tidak memiliki data)
Ini dikarenakan Kotlin bisa mengakses Java, dan kebanyakan di Java, semua variable bisa null
Untuk membuat variable bisa bernilai null, di Kotlin bisa menggunakan ? (tanda tanya) setelah tipe datanya.
Penggunaan  fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode Java


CONSTANT
-Constant adalah Immutable data, yang biasanya diakses untuk keperluan global.
-Global artinya bisa diakses dimanapun
-Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan UPPER_CASE dalam pembuatan nama variable constant nya
*/

//Constant variable (digunakan global)
const val APP = "Belajar Kotlin"
const val SERIAL_NUMBER = 13720
const val VERSION = "3.22.44"

fun main() {
   var name: String = "Lewis" // Mutable variable
   name = "Sir. Lewis"
   val driver = "Leclerc" // Immutable variable
    println(name)
    println(driver)

    //NULLABLE
    var winner: String? = "Russel"
    winner = null
    var fastestLap: Int? = null
    println(winner)
    println(winner?.length)
    println(fastestLap)

    //Constant variable
    println(APP)
    println(SERIAL_NUMBER)
    println(VERSION)
}