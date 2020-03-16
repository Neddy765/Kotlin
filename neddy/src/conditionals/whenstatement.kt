package conditionals

import java.util.*

import  java.util.*
fun main(args: Array<String>) {

    val age: Int
    val chukua: Scanner = Scanner(System.`in`)
    println("Enter your age please")

    age = chukua.nextInt()


    when(age){
        in 1..17 ->{
        println("Still a child")
    }
        in 18..45 ->{

            println("Youthfull")
        }
        in 45..150 ->{

            println("Old")
        }else->{
        println("No such age")
    }

    }









}