package Challange

class CapitalizeSentence {
    fun read(kalimat: String){
        val phraseChar = kalimat.toCharArray()
        for(i in phraseChar.indices){
            if(phraseChar[i].isWhitespace()){
                phraseChar[0] = phraseChar[0].toUpperCase()
                phraseChar[i+1] = phraseChar[i+1].toUpperCase()
            }
        }
        print("After Conversion : ")
        println(phraseChar)
    }
}

fun main() {
    val capitalizeSentence = CapitalizeSentence()
    print("Input your sentence : ")

    val sentenceInput = readLine()
    print("Before Conversion : ")
    println(sentenceInput)
    if (sentenceInput != null) {
        capitalizeSentence.read(sentenceInput)
    }
}