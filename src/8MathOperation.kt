fun main() {
    val a: Int = 55
    var b: Int = 73

    //Scientific Calculator | Otomatis memperioritaskan '*' dan '/' di banding '+' dan '-'
    val result1 = a * b / b
    val result2 = 10 + 10 / 2

    //Augmented Assignments
    var result3 = 10
    result3 += 53
    var result4 = 99
    result4 /= 3
    var result5 = 55
    result5 %= 16

    //Unary Operator
    b++
    b++
    b++
    val result6 = b
    b--
    b--
    val result7 = b
    val result8 = -a
    val bool: Boolean = false
    val result9 = !bool

    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)
    println(result6)
    println(result7)
    println(result8)
    println(result9)
}