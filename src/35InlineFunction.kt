/*
INLINE FUNCTION
- Menggunakan Higher-Order Function adalah salah satu fitur yang sangat berguna.
- Namun penggunaan Higher-Order Function akan berdampak terhadap performa saat aplikasi berjalan, karena harus membuat object lambda berulang-ulang. Jika penggunaannya tidak terlalu banyak mungkin tidak akan terasa, tapi jika banyak sekali, maka akan terasa impact nya
- Inline Functions adalah kemampuan di Kotlin yang mengubah Higher-Order Function menjadi Inline Function
- Dimana dengan Inline Function, code di dalam Higher-Order Function akan di duplicate agar pada saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang
 */

inline fun hello3(name: ()-> String): String {
    return "Hello ${name()}"
}

/*
NOINLINE FUNCTION
- Saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline
- Jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter, kita bisa menandai parameter tersebut dengan kata kunci noinline
 */

inline fun hello4(firstname: () -> String, noinline midName: () -> String, noinline lastname: () -> String): String {
    return "Assalamualaikum.. ${firstname()} ${midName()} ${lastname()}"
}

fun main() {
    println(hello3 { "Muhammad" })
    println(hello3 { "Riko" })
    println(hello3 { "Ismail" })
    for ( value in 0..100) {
        println(hello3 { "Muhammad" })
    }

    println(hello4({"Muhammad"},{"Riko"}, {"Ismail"}))
}