class Variables {
    var first: Int = 10
    var greet: String = "okay"
    var firstAlpabeth: Char = 'A'
    var isOpen: Boolean = true

    fun callAll(){
        println("Integer test : " + first)
        println("String test : " + greet)
        println("Character test : " + firstAlpabeth)
        println("Boolean test : " + isOpen)
    }
}

fun main() {
    val Variables = Variables()
    Variables.callAll()
}