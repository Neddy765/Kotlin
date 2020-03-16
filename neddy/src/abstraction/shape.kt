package abstraction



abstract class Shape(open var color:String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
    abstract fun printout(): String
}


class Circle(override var color: String,var radius:Double):Shape(color) {
    override fun area(): Double {
        return Math.PI*radius*radius
    }

    override fun perimeter(): Double {
        return Math.PI*2*radius
    }

    override fun printout(): String {
        return "perimeter is "+perimeter()+" Area ="+area()
    }

    override fun toString(): String {
        return "Circle(color='$color', radius=$radius)"
    }

}

class Rectangle(override var color: String,var length:Double,var width:Double):Shape(color)
{
    override fun area(): Double {
        return length*width
    }

    override fun perimeter(): Double {

        return 2*(length+width)
    }

    override fun printout(): String {
        return "the perimeter is "+perimeter()+" and the area is"+area()
    }

    override fun toString(): String {
        return "Rectangle(color='$color', length=$length, width=$width)"
    }

}


class Triangle(override var color: String,var base:Double,var height:Double,var side:Double):Shape(color) {
    override fun area(): Double {
        return 0.5*(base * height)
    }

    override fun perimeter(): Double {

        return base + (side * 2)
    }

    override fun printout(): String {
        return "the perimeter is " + perimeter() + " and the area is" + area()
    }

    override fun toString(): String {
        return "Triangle(color='$color', base=$base, height=$height, side=$side)"
    }

}

fun main(args: Array<String>) {
    val circleone=Circle("yellow",5.9)
    println(circleone.area())
    println("=======================================================================")

    println(circleone.perimeter())
    println("=======================================================================")

    println(circleone.printout())
    println("=======================================================================")

    println(circleone.toString())
    println("=======================================================================")
    println("=======================================================================")
    println("=======================================================================")


    val rectangleone=Rectangle("red",20.5,20.7)
    println(rectangleone.area())
    println("=======================================================================")
    println(rectangleone.perimeter())
    println("=======================================================================")
    println(rectangleone.printout())
    println("=======================================================================")
    println(rectangleone.toString())
    println("=======================================================================")
    println("=======================================================================")
    println("=======================================================================")

    val triangleone=Triangle("black",2.5,6.8,4.7)
    println(triangleone.area())
    println("=======================================================================")
    println(triangleone.perimeter())
    println("=======================================================================")
    println(triangleone.printout())
    println("=======================================================================")
    println(triangleone.toString())

}