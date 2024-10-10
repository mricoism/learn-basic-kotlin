/*
LABEL
- Label adalah penanda
- Semua expression di Kotlin bisa ditandai dengan label
- Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @

BREAK, CONTINUE, & RETURN
- Salah satu kegunaan label adalah, bisa diintegrasikan dengan break, continue dan return
- Biasanya break, continue dan return hanya bisa menghentikan proses di blok kode tempat mereka berada, namun dengan menggunakan label, kita bisa menentukan ke label mana kode akan berhenti

 */
fun breakLoop() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10 ){
            if (i > 3) {
                break@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}
fun continueLoop() {
    loopA@ for (a in 1..10) {
        loopB@ for (b in 1..10 ){
            if (b == 5) {
                continue@loopA
            }
            println("$a x $b = ${a * b}")
        }
    }
}
fun test(name: String, operation: (String) -> Unit) = operation(name)

fun main() {
    breakLoop()
    println()
    continueLoop()
    println()
    test("") lambda@{
        if (it == "") {
            return@lambda // akan error tanpa label. karna lambda tidak bisa return
        } else {
            println("msiocirm")
        }

    }


}