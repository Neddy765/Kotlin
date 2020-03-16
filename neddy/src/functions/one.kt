package functions

import java.util.*

fun hello(){
    println("hello world")
}

fun sum(num1:Int, num2:Int){
    val result=num1+num2
    println("The sum  $num1 and $num2 is " +result)
}

fun squares(x:Double)=x*x
fun HappyBirthday(name:String,age:Int){
    println("Happy $age'th Birthday $name")
}
fun sum(num1:Int, num2:Int, num3:Int){
    val result=num1+num2+num3
    println("The sum  $num1 and $num2 and $num3 is " +result)
}


fun product(num1:Int, num2:Int, num3:Int){
    val result=num1*num2*num3
    println("The product  $num1 and $num2 and $num3 is " +result)
}
fun area(pi: Int,radius: Int) {
val result=pi*radius
    println("The area of a circle whose radius is $radius is" + result)
    val radius: Double

}

fun main(args: Array<String>) {

    hello()
    sum(num1 =7, num2=5)
  sum(num1=78, num2=25)
    HappyBirthday(name = "Neddy" , age = 18)
sum(num1=23, num2=4, num3=1)
    product(num1=2, num2=4, num3=2)
area(pi=3, radius = 7)



}
