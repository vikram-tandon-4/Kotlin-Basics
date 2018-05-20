fun main(arg : Array<String>){
   var answer : Int = multiply(2,3)
    var max : Int = checkMax(2,3)
    println("multiplication : $answer")
    println("max : $max")
}

// function with 2 integer arguments
// return multiplication of 2 numbers
fun multiply(num1 : Int, num2 : Int) : Int = num1*num2

fun checkMax(num1 : Int, num2 : Int) : Int = if(num1> num2) num1 else num2