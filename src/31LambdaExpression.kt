/*
LAMBDA EXPRESSION
- Function di kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya.
- Bisa disimpan di variable, array, bahkan bisa dikirim ke parameter function itu sendiri
- Lambda expression secara sederhana adalah function yang tidak memiliki nama
- Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan mendeklarasikan nama function nya
- Dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya

*/

var lambdaName: (String) -> String = { value: String ->
    value.uppercase()
}
val name: String = lambdaName("riko")

var infoDriverBehind: (String, Double, String) -> String = { name: String, distance: Double, tires: String ->
    "$name is behind you, he is $distance right now. Using $tires tires"
}
var infoBehind = infoDriverBehind("LANDO", 1.320, "SOFT")
var infoBehind2 = infoDriverBehind("Albond", 1.320, "Hard")

//IT
// Kata kunci "it" hanya bisa di gunakan apabila param dari lambda hanya ada 1
var bachelorEngineering: (String) -> String = {
    it + ".ST"
}
var name2 = bachelorEngineering("Muhammad Riko Ismail")

//METHOD PREFERENCE
// Membuat lambda dari (refrensi) function yang sudah ada
fun totalLaps(first: Double, second: Double, third: Double) = first + second + third
val lambdaLaps: (Double, Double, Double) -> Double = ::totalLaps
val myTime = lambdaLaps(0.222, 0.734, 0.333)

fun main() {
    println(name)
    println(infoBehind)
    println(infoBehind2)
    println(name2)
    println(myTime)
}

