/*
FUNCTION NAMED ARGUMENT
- Kadang ada function yang parameternya banyak sekali
- Hal ini sangat menyulitkan saat kita akan memanggil function tersebut, kita harus benar-benar tahu urutan parameter di function tersebut
- Untungnya kotlin memiliki fitur yang namanya Named Argument
- Named Argument adalah fitur dimana kita bisa menyebutkan nama parameter saat memanggil function, dengan demikian kita tidak wajib tahu posisi tiap parameter
*/

fun main() {
    hammerTime(driverInFront = "Norris", driverBehind = "Max", distanceWithFront = 2.203, distanceWithBehind = 5.608)
}

fun hammerTime(driverInFront: String, distanceWithFront: Double, driverBehind: String, distanceWithBehind: Double) {
    println("RACE ENGINEER")
    println("Okay mate its hammer time!")
    println("Driver behind you is $driverBehind, $distanceWithBehind seperSecond")
    println("And driver front of you is $driverInFront, $distanceWithFront seperSecond")
}