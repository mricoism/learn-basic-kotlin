/*
FUNCTION PARAMETER
*/


val laps = 19
val totalLaps = 63
val drivers = arrayOf("Lecrec", "Lando", "Piastri",)


fun main() {
    changeTiresAt(laps)
    tireOffset(currentTires = "Medium", changeAtLaps = 19, totalLaps)
    undercutBy(null)
}

fun changeTiresAt(laps: Int) {
    println("Driver: This tires is dead, i have no grip at all. Can we change it in laps $laps ?")
}
fun tireOffset(currentTires: String, changeAtLaps: Int, totalLaps: Int?) {
    if (currentTires == "Soft" && (changeAtLaps > 10 && changeAtLaps <= 23)){
        println("Race Engineer: Currently you running in $currentTires tires,")
        println("Race Engineer: so.. we would recommend you to use Medium tires bcs tires degradation is dosent looks bad")
    } else if (currentTires == "Medium" && (changeAtLaps > 15 && changeAtLaps <= 29)) {
        println("Race Engineer: Currently you running in $currentTires tires,")
        println("Race Engineer: So.. we Need to know if you can manage the tires or not, then we can decide that you need to box and change the tires")
    } else if (currentTires == "Hard" && (changeAtLaps > 20 && changeAtLaps <= 35)) {
        println("Race Engineer: Currently you running in $currentTires tires, we are try to use \"go long strategy\"")
        println("Race Engineer: So.. we need to maximize tire offset then we change to soft tire for pushing")
    } else {
        println("Race Engineer: Copy.. We're cheking!, i will come back to you..")
    }
}

fun undercutBy(by: Array<String?>?) {
    println("Race Engineer: we try to undercut ${drivers[0]} and ${drivers[1]}")
}