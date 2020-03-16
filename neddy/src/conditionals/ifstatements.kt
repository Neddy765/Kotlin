package conditionals

import java.util.*
fun main(args: Array<String>){

val age:Int
val chukua:Scanner =Scanner(System.`in`)
println("Enter your age please")

    age=chukua.nextInt()

    if (age<18){
        println("Child")
    }
    else if (age<45){
        println("Youth")
    } else {
        println("Old")
    }





}