package librarysystem



import java.time.Year

abstract  class library( open var bookname:String,open var author:String,open var year:Int){
    abstract fun book ():String
}



class savebook(override var bookname: String, override var author: String, override var year: Int):library(bookname,author,year) {
    override fun book():String {
        return "The book $bookname by $author has been added to the stock"

    }

    override fun toString(): String {
        return "(bookname='$bookname', author='$author', year=$year)"
    }

}
enum class retrievebooks{
    ALMOST_THERE ,wee ,us ,Tumbo_lisiloshiba

}
data class borrowbooks( var book:retrievebooks) {

    fun storedbooks() {
        println("You have borowed the book $book, KINDLY RETURN WITHIN THE SPECIFIED TIME")


    }
}
class returnbook(override var bookname: String,override var author: String, override var year: Int):library(bookname,author,year){
    override fun book(): String {
        return "The book $bookname written by $author has been returned to library, Welcome again!!"
    }


}

fun main(args: Array<String>) {

    val bookone=savebook("The River and the Source","Margaret A Ogolla",2008)
    println(bookone.book())
    println(bookone.toString())
    val booktwo=borrowbooks(retrievebooks.Tumbo_lisiloshiba)
    println(booktwo.storedbooks())
    val bookthree=returnbook("Kigogo","Pauline Kea",2019)
    println(bookthree.book())














}



































































































