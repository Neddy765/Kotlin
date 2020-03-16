package abstraction



interface Drive{
    fun drive()
}
interface Repair{
    val time:Int
    fun fix()

}

class Gari (var plate:String):Drive,Repair{
    override fun drive() {
        println("Driving a car with No. plate $plate")
    }

    override val time: Int=2

    override fun fix() {
        println("fixing your car:May take $time days")
    }


}
class Bike (var plate:String):Drive{
    override fun drive() {
        println("Riding a bike with No. plate $plate")
    }


}

fun main(args: Array<String>) {
    val carone=Gari("KBZ")
    println(carone.drive())
    carone.fix()
}



