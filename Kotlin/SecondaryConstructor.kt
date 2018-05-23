fun main(arg : Array<String>){

    var second = SecCons("xyz")
    second.printString()

    var secondCons = SecCons("xyz",15)
}

// with constructor keyword
class SecCons constructor(str : String){
    var str2 : String = str
    var number : Int = 0;

    // Secondary constructor with 2 arguments
    // call default constructor with this keyword
    constructor(str: String, number: Int): this(str){
        this.number = number
        println("Constructor argument1 :  $str2  Constructor argument2 :  $number")
    }


    fun printString(){
        println("Constructor argument: "+ str2)
    }
}
