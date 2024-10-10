/*
COMPARISON OPERATOR
Operator    | Keterangan
--------------------------------------
>           | Lebih dari
<           | Kurang dari
>=          | Lebih dari sama dengan
<=          | Kurang dari sama dengan
==          | Sama dengan
!=          | Tidak sama dengan
*/

fun main() {
    val a = "Lewis Hammilton"
    val b = "Sir. Lewis Hammilton"
    val c = 16
    val d = 55
    val e = true

    val result1: Boolean = a == b
    val result2: Boolean = c > d
    val result3 = c < d
    val result4 = c <= 16
    val result5 = e != true

    println("a == b : ${result1}")
    println("c > d : ${result2}")
    println("c < d : ${result3}")
    println("c <= 16 : ${result4}")
    println("e != true : ${result5}")
}