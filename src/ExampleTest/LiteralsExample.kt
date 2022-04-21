package ExampleTest

import Literals

/*
    Open time : 7 am - 10 pm --> announce with "Shop is open"
    other than that is closed --> announce with "Sorry, shop is closed"
*/
class LiteralsExample {
    var open = 7
    var closed = 10

    var isOpen = "Shop is open"
    var isClosed = "Sorry, shop is closed"

    fun greetingsUser(){
        print("Input entry time : ")
        val entryTime = readLine()!!.toInt()

        if (entryTime != null) {
            if(entryTime > 7 && entryTime < 10){
                println(isOpen)
            }else{
                println(isClosed)
            }
        }
    }
}

fun main(){
    val LiteralsExample = LiteralsExample()
    LiteralsExample.greetingsUser()
}