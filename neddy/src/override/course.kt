package override

abstract class Course(val topic:String,val price:Int){

    open fun learn(){

        println("Learning $topic at Ksh.$price")

    }

}

interface Videostutorials{
    fun learn(){
        println("Using videos to learn")
    }
}


class AndroidCourse():Course("Android",price = 20000),Videostutorials{

    override fun learn() {
        super<Course>.learn()
        super<Videostutorials>.learn()


        println("Learning Android is Fun!!!")
    }

}

fun main(args: Array<String>) {
    val a=AndroidCourse()

    a.learn()


}

