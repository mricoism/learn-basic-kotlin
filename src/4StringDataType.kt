import kotlin.concurrent.fixedRateTimer

/*
STRING DATA TYPE
Tipe data string adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.
Di kotlin, tipe data string direpresentasikan dengan kata kunci String.
Untuk membuat string di kotlin, kita bisa menggunakan:
“ (tanda petik 2) untuk teks satu baris
“”” (tanda petik 2 sebanyak 3 kali) untuk teks lebih dari satu baris

*/

fun main() {
    var name: String = "Muhammad Riko Ismail"
    var address: String = """
        JL. Permai 2, No.96, 
        Rt.001/Rw.013, 
        Kel. Cibubur, 
        Kec. Ciracas, 
        Jakarta Timur, 
        KodePos.13720
    """.trimIndent() //trimIndent() menggabungkan line dengan merapihkannya
    var spekMacbook: String = """
        |MacBook Pro 2017,
        |13 Inch,
        |Core i5,
        |Ram 16gb,
        |MacOS Sonoma,
    """.trimMargin()
    var spekiPhone: String = """
        >iPhone 12 Mini,
        >uknown Inch,
        >apple A unknown,
        >Ram 4gb,
        >iOS 16.5,
    """.trimMargin(">")
    println(name)
    println(address)
    println()
    println(spekMacbook)
    println()
    println(spekiPhone)
    println()

    // Interpolation atau penggabungan string
    var firstName: String = "Lewis"
    var lastName: String = "Hammilton"
    var fullName: String = firstName + " " + lastName
    println(fullName)
    // Concatination
    println("Hi, There! my name is sir.${firstName} ${lastName}")
    println("i have ${fullName.length} character in my name")
}