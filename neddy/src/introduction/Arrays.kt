package introduction

fun main(args: Array<String>) {
    val towns = arrayOf("Nairobi", "Mombasa", "Kisumu")
    println(towns[2])

    val mixed = arrayOf("Kisumu", 45, false, 0.97866)
    println(mixed[1])
    val weight = intArrayOf(34, 90, 87, 67)
    println(weight[3])

    //string as array
    val name = "eMobilis"


    println("the char at 1 is" + name[0])
    println("the char at 2 is" + name[1])
    println("the char at 3 is" + name[2])
    println("the char at 4 is" + name[3])

    //add two arrays
    val moretowns = arrayOf("Kitui", "KIambu", "Muranga", "Narok")
    val counties = towns + moretowns
    println("The size of counties is" + counties.size)
    println(counties[6])

    println(counties.isEmpty())
    if (counties.contains("Samburu")) {
        println("Present")
    } else {
        println("Absent")

    }
}

