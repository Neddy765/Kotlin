package abstraction



interface Customer{
    fun checkBalance()
    fun deposit(m:Int)
    fun withdraw(m:Int)

}
class MyAccount:Customer {
    var money=0
    var balance=0


    override fun checkBalance() {
    }

    override fun deposit(m: Int) {
        balance+=m
    }

    override fun withdraw(m: Int) {
        balance-=m
        if (m<40){
            println("you can withdraw")
        }else{

            println("transaction not possible")
        }



    }

    override fun toString(): String {
        return "MyAccount(balance=$money)"
    }
}

fun main(args: Array<String>) {


    val nationalbank=MyAccount()
    nationalbank.deposit(m=40)
    nationalbank.withdraw(m=20)

    println(nationalbank.toString())

}
