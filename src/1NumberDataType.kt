/*
INTEGER NUMBER
Type    | Size  | Min Value                     | Max Value
--------------------------------------------------------------------------
Byte    | 8     | -128                          | 127
Short   | 16    | -32768                        | 32767
Int     | 32    | -2,147,483,648                | 2,147,483,647
Long    | 64    | -9,223,372,036,854,775,808    | 9,223,372,036,854,775,807


FLOATING POINT NUMBER
Type    | Size  | Significant bits  | Significant bits  | Decimal digits
--------------------------------------------------------------------------
Float   | 32    | 24                | 8                 | 6-7
Double  | 64    | 53                | 11                | 15-16
*/

fun main() {
    // Integer Number
    val numByte: Byte = 8
    val numShort: Short = 16
    val numInt: Int = 32
    val numLong: Long = 99999
    println("Integer Number")
    println(numByte)
    println(numShort)
    println(numInt)
    println(numLong)
    println()

    // Floating Number
    val numFloat: Float = 4.5F
    val numDouble: Double = 5.5
    println("Floating Number")
    println(numFloat)
    println(numDouble)
    println()

    // Literal
    // ~gue baru tau kalau ternyata bisa nyimpen ginian di dalem integer
    val decimalLiteral: Int = 100
    val hexaDecimalLiteral: Int = 0xFF
    val binaryLiteral : Int = 0b0001
    println("Literal")
    println(decimalLiteral)
    println(hexaDecimalLiteral)
    println(binaryLiteral)
    println()

    //Underscore
    // Fungsinya hanya agar mudah di baca seperti ada spasi separator
    val age: Byte = 5_0
    val height: Int = 1_6_5
    val distance: Short = 2_0_3
    val balance: Long = 1_000_000_000L
    println("Underscore")
    println(height)
    println(distance)
    println(balance)
    println()

    //Conversion
    // Jika dari Long turun ke Int, Short, atau byte maka akan terjadi pengurangan value berdasarkan limit
    // (Integer overflow / number overflow)
    val number: Int = 1_000_000
    val toByte: Byte = number.toByte()
    val toShort: Short = number.toShort()
    val toInt: Int = number.toInt()
    val toLong: Long = number.toLong()
    val toFloat: Float = number.toFloat()
    val toDouble: Double = number.toDouble()
    println("Conversion")
    println(toByte)
    println(toShort)
    println(toInt)
    println(toLong)
    println(toFloat)
    println(toDouble)
    println()
}