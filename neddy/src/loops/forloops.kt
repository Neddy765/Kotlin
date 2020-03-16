package loops

fun main(args: Array<String>) {
    for (i in 1..10){
        println("Hello at $i")

    }

    println("................")
    
    var add=0
    for (j in 1..100){
        add=add+2
    }
    println("THe sum is $add")

    println("................")

val list= listOf(1,2,3,2)
for (value in list){
    println("We are at $value")



}
    val language = listOf("Java,Kotlin,Html")
for ((index,value) in language.withIndex()){
    println("Language at $index is $value")

}




}