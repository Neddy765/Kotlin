package oop

 open class Unit(open val name:String, open val age:Int){

    fun speak(name:String){
        println("Sasa  $name")
    }
    fun getBirthday()=2020-age
    fun unitprint(name:String, age:Int){
        println("Name is $name and age is $age")
    }

}

class lady(override val name: String, override val age: Int):Unit(name, age){

    fun hair(){
        println("Has long hair")
    }
    fun isIntelligent()=true


}
class Employee(override val name: String,override val age: Int):Unit(name, age){



}

fun main(args: Array<String>) {
    val unittone=Unit(name = "Jack" , age = 12)
    unittone.speak(name = "Jack")

    val ladyone=lady(name = "Ellen", age = 7)
    ladyone.hair()
    ladyone.speak(name = "Ellen")
    println(ladyone.getBirthday())
    println(ladyone.isIntelligent())
val empone=Employee(name = "KIthua", age = 55 )
    empone.speak(name = "Kithua")



}


