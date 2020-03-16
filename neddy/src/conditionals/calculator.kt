package conditionals

import java.util.*

fun main(args: Array<String>) {
    val num1: Double
    val num2: Double

    val scan = Scanner(System.`in`)

    println("enter your first number")
    num1 = scan.nextDouble()
    println("Enter second number")
    num2 = scan.nextDouble()

    println("enter operator")
    val operator = scan.next()[0]

    val output: Double

    output = when (operator) {

        '+' -> num1 + num2
        '-' -> num2 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2

        else -> {
            println("Wrong operator")
            return
        }

    }
    println("$num1 $operator $num2=$output")
}
