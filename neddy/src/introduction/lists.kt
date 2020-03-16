package introduction

fun main(args: Array<String>) {
    val ladies= arrayListOf("mercy","jane","paula")
    val gents= arrayListOf("mark","john","paul")
    println(gents[0])
    val people=gents+ladies
    println("The size of people is "+people.size)
    println(people[4])
    println(ladies.isEmpty())
    println(gents.contains("Paul"))
    gents.add("kirk")
    println(ladies)
    println(gents)

    ladies.add(2,"salome")
    println(ladies[2])



}