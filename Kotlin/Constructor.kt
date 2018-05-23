
fun main(arg : Array<String>){

    var second = Second("xyz")
    second.printString()

    var third = Third("abc")
    third.printString()
}

// with constructor keyword
class Second public constructor(str : String){

   var str2 : String = str

    fun printString(){
        println("Constructor argument: "+ str2)
    }
}

// without constructor keyword
class Third (str : String){

    var str2 : String = str

    fun printString(){
        println("Constructor argument: "+ str2)
    }
}