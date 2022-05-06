package Challange

class GetOddsNumber {
    var checkedint = Array<Int>(5){0}
    var c:Int = 0
    fun checkNumber(number: Int){
        if(number % 2 == 1){
            checkedint[c] = number
            c++
        }
    }
    fun printNumber(){
        println("The odds number : ")
        checkedint.forEach {
            print(it)
            print(" ")
        }
    }
}

fun main(args:Array<String>){
    val getOddsNumber = GetOddsNumber()


    var arrayint = Array<Int>(5){0}
    var x:Int = 0
    val abc:Int = arrayint.size
    while(x < abc){
        print("Input number - " + (x+1) + " : ")
        arrayint[x] = readLine()!!.toInt()
        getOddsNumber.checkNumber(arrayint[x])
        x++
    }

    getOddsNumber.printNumber()
}