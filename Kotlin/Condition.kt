fun main(arg : Array<String>){

    var result: Int;

    var value1: Int = 5
    var value2: Int = 7

    result = if(value1 > value2)
        value1
    else
        value2

    println("Greater value $result")
}