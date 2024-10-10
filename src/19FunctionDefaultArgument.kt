/*
FUNCTION DEFAULT ARGUMENT
- harus di tempatkan di akhir agar tidak error
*/

fun main() {
    pitting(laps = 20)
    fastestLap("Ricciardo")
}

fun pitting(laps: Int, tires: String = "Hard",) {
    println("Box box box.. at laps $laps")
    println("So we are try to catch max in front by change to $tires tires")
}

fun fastestLap(name: String? = null) {
    if (name == null) {
       println("No need to worry mate, no one steal fastest lap yet")
    } else {
        println("So its $name, take fastest lap by 1.220S with Soft tire ")
    }
}