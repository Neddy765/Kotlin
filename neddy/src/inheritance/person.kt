   package inheritance

   open class Person(open val name:String,open val age:Int){

       fun speaks(name:String){
           println("Hey my name is $name")
       }
       fun getBirthyear()=2020-age
       class Employee(override val name: String,override val age: Int,val salary:Int):Person(name, age){

           fun receivepay(salary: Int):String{
               return "Salary is $salary"
           }
       }
   }

   class Student(override val name: String,override val age: Int,val course:String):Person(name, age){
       fun Courseis(course: String):String{
           return "Student is taking $course"
       }

   }

   class Child(override val name: String,override val age:Int,val school:String):Person(name,age) {
       fun schoolis(school: String) {
           println("Student is in $school")

       }

       override fun toString(): String {
           return "Child(name='$name', age=$age, school='$school')"
       }
   }

   fun main(args:Array<String>) {
       val std1=Student("Grace",22,"MIT")
       println("Birth year is "+std1.getBirthyear())
       std1.speaks("Grace")
       println(std1.Courseis("MIT"))
       println(std1.toString())
       println("=======================================================================")
       val emp001=Person.Employee("Henry",44,40000)
       emp001.speaks("Henry")
       println("Henry was born in"+emp001.getBirthyear())
       println(emp001.receivepay(10000))
        val childone=Child("Juju",12,"Joy academy")
       childone.schoolis("Joy academy")
       println(childone.toString())

   }

//create a class child(Persons(Name,age), val (school:String)
//method() schoolis()  and toString()
// create an object and print out the methods

