/*
TABEL PAPA ZOLA

OPERATION && (AND)
Nilai 1 | Operator  | Nilai 2   | Hasil
---------------------------------------------
true    | &&        | true      | true
true    | &&        | false     | false
false   | &&        | true      | false
false   | &&        | false     | false

OPERATION || (OR)
Nilai 1 | Operator  | Nilai 2   | Hasil
---------------------------------------------
true    | '||'      | true      | false
true    | '||'      | false     | true
false   | '||'      | true      | true
false   | '||'      | false     | false

Operation Negation ! (NOT)
!true = false
!false = true
*/

fun main() {
    val a: Boolean = true
    val b: Boolean = false
    val c: Boolean= true

    println("true && true : ${true && true}")
    println("true && false : ${true && false}")
    println("false && true : ${false && true}")
    println("false && false : ${false && false}")
    println()

    println("true || true : ${true || true}")
    println("true || false : ${true || false}")
    println("false || true : ${false || true}")
    println("false || false : ${false || false}")
    println()

    println(a == false || b != true)
    println(!true)
    println(!false)
    println()

    val finalExam = 88
    val attendant = 75
    val passFinalExam = finalExam > 70
    val passAttendant = attendant > 80
    val pass = passFinalExam && passAttendant
    print(pass)
}
