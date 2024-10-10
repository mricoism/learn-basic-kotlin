/*
ANONYMOUS FUNCTION
- Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
- Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan hasil dimanapun
- Untuk hal ini, kita bisa menggunakan Anonymous Function
- Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci func
 */

val anonymousFunction = fun(value: String?): String {
    if (value == null || value == "") {
        return "Hallo.. ANONYM"
    } else {
        return "Hallo.. $value"
    }
}

fun hello2(value: String, transformer: (String) -> String): String {
    val result = transformer(value)
    return "Holaaa "+ result
}

val anonymUpper = fun(value: String): String {
    if (value == "") {
        return "UPS"
    } else {
        return  value.uppercase()
    }
}

fun main() {
    println(anonymousFunction(null))
    println(anonymousFunction("Riko"))
    val result1 = hello2("riko", anonymUpper)
    println(result1)
    val result2 = hello2("MSIOCIRM", fun(value: String): String {
        return value.lowercase()
    })
    println(result2)
}