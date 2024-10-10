/*
UNIT RETURNING FUNCTION
- Function ada 2 jenis, pertama tidak mengembalikan nilai, yang kedua mengembalikan nilai
- Function-function yang sebelumnya sudah kita buat adalah function yang tidak mengembalikan nilai
- Sebenarnya, function-function yang sudah kita buat sebelumnya, dia mengembalikan tipe data Unit, dimana Unit adalah tanda bahwa function tersebut tidak mengembalikan apa-apa
- Penulisan Unit adalah tidak wajib, namun jika kita menulis tipe data pengembalian sebuah function, maka secara otomatis dia adalah Unit
- Unit = void di Dart dan Swift
*/

fun main() {
    position(1.25)
}

fun position(times: Double): Unit {
    when {
        times >= 1.30 -> {
            println("You are in bottom 5")
        }
        times >= 1.28 -> {
            println("You are in top 10")
        }
        times >= 1.26 -> {
            println("You are in top 5")
        }
        times <= 1.26 -> {
            println("You are in pole position")
        }
        else -> {
            println("Your time was deleted")
        }
    }

}