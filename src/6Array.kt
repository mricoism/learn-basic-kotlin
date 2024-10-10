fun main () {
    val drivers: Array<String> = arrayOf("Hammilton", "Verstappen", "Leclerc", "Sainz")
    println(drivers)
    println(drivers[0])
    println(drivers.size) // Panjang Array
    println(drivers.get(index = 2)) // mendapatkan data di posisi index

    drivers.set(index = 2, value = "Piastri")
    drivers[1] = "Kimi"
    println(drivers[2])
    println(drivers[1])


    //NULLABLE ARRAYS
    val teams: Array<String?> = arrayOfNulls(3) // jika lebih dari 3 maka error
    println(teams)
    println(teams[0])

    teams.set(index = 0, value = "Mercedes AMG Petronas")
    teams[1] = "HONDA RED BULL ORACLE"
    teams[2] = "Scudea Ferrari"
//    teams[3] = "MCLaren"
//    teams.set(index = 4, value = "Williams")
    println(teams[2])

    val tires: Array<String> = arrayOf()
    tires.toSet()
    println(tires[0])
}