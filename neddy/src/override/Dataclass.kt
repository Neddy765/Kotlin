package override


class   Book(var name:String,var author:String,var price:Int){






}

data class   DataBook(var name:String,var author:String,var price: Int){




}

fun main(args: Array<String>) {

    val bookone=Book("Roar","Jane B",price = 2000)
    val booktwo=Book("Roar","Jane B",price = 2000)

    val databookone=DataBook("Roar","Jane B",price = 2000)
    val databooktwo=DataBook("Roar","Jane B",price = 2000)


    println(bookone)
    print(databookone)

    println(bookone.equals(booktwo))
    println(databookone.equals(databooktwo))

}