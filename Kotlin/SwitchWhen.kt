
fun main(args : Array<String>){

    // final value
    // cannot be changed
    val num : Int = 2
    // Alternative of switch case
    // no break statement required
    // else works as default
    when(num) {

        1 -> println("This is 1")
        2 -> println("this is 2")
        3 -> println("this is 3")
        else -> println("Did not match")
    }

    // Assignment of value
       val str : String = when(num){

            1 -> "This is 1"
            2 -> "this is 2"
            3 -> "this is 3"
           else -> "Did not match"
    }

    println("This is the string value $str")
}