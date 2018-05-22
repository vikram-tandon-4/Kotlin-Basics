fun main(arg : Array<String>){

    var num : String = "9b"

    try{
        // Type cast string to int
        var number : Int = num.toInt()
        println(number)
    }catch (e : NumberFormatException){
        println("Exception:")
        println(e.message)
    }
}