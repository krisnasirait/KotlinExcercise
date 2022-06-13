package Challange

class ContainsRange {
    lateinit var resultString:String
    fun checkRange(range1: Int, range2: Int, range3: Int, range4: Int){
        if(range3 > range1 && range3 < range2 && range4 < range2 && range4 > range1){
            resultString = "true"
            print("contains range (" + range1 + ".." + range2 + "," + range3 + ".." + range4 + ") should be equal to : " + resultString)
        }else{
            resultString = "false"
            print("contains range (" + range1 + ".." + range2 + "," + range3 + ".." + range4 + ") should be equal to : " + resultString)
        }
    }
}

fun main() {
    val containsRange = ContainsRange()

    var range1:Int
    var range2:Int
    var range3:Int
    var range4:Int


        print("Input range1 - " + " : ")
        range1 = readLine()!!.toInt()
        print("Input range2 - " + " : ")
        range2 = readLine()!!.toInt()
        print("Input range3 - " + " : ")
        range3 = readLine()!!.toInt()
        print("Input range4 - " + " : ")
        range4 = readLine()!!.toInt()

    containsRange.checkRange(range1, range2, range3,range4)
}