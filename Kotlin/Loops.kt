fun main(arg : Array<String>){

    // range from 1 to 10
    var range= 1..10
    println("count = ${range.count()}")

    for(i in range){
        println(i)
    }

    // range from A to z according to ASCII codes
    var rangeAlpha= 'A'..'z'

    for(i in rangeAlpha){
        println(i)
    }


    // when printing from higher number to lower number
    var rangeReverse= 10 downTo 0

    for(i in rangeReverse){
        println(i)
    }

    // when leeaving the last value
    var rangeLast= 0 until 10

    for(i in rangeLast){
        println(i)
    }

    // when printing in reverse order
    var rangeReversed= 0..10

    for(i in rangeReversed.reversed()){
        println(i)
    }
}