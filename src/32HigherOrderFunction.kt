/*
HIGHER ORDER FUNCTION
- Higher-Order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function
- Penggunaan Higher-Order Function kadang berguna ketika kita ingin membuat function yang general dan ingin mendapatkan input yang flexible beruba lambda, yang bisa dideklarasikan oleh si user ketika memanggil function tersebut
*/

fun hello(value: String, transformer: (String)-> String): String {
    return "Hello ${transformer(value)}"
}

fun main() {
    val uppercaseName: (String) -> String = {
        it.uppercase()
    }
    println(hello("muhammad riko ismail", uppercaseName))
    println(hello("RIKO", { value: String -> value.lowercase() }))

    // TRAILING LAMBDA
    // menempatkan lambda terakhir (di ujung).
    val result1 = hello("Muhammad Riko Ismail") { value: String ->
        value.uppercase()
    }
    val result2 = hello("MSIOCIRM") {
        it.lowercase()
    }
    println(result1)
    println(result2)
}