package conditionals

import java.util.*

import  java.util.*
fun main(args: Array<String>) {

    val marks: Int
    val chukua: Scanner = Scanner(System.`in`)
    println("Type in your marks here")

    marks = chukua.nextInt()


    when (marks) {
        in 0..20 -> {
            println("fail")
        }
        in 21..40 -> {

            println("pass")
        }
        in 41..64 -> {

            println("Credit")
        }
        in 65..100 -> {

            println("Distinction")
        }

        else -> {
            println("Invalid marks")
        }

    }
}












