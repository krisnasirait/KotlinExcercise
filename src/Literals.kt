class Literals {
    var intLiteral = 5
    var stringLiteral = "Test Literal"
    var doubleLiteral = 0.002
    var charLiteral = '1'
    var boolLiteral = true

    fun printAll(){
        println(intLiteral)
        println(stringLiteral)
        println(doubleLiteral)
        println(charLiteral)
        println(boolLiteral)
    }
}

fun main() {
    val literals = Literals() //call a class

    literals.printAll()
}