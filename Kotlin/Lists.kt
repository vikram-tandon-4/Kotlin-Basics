fun main(arg : Array<String>){

    var listOfLetters = listOf('a','b','c','d','e','f','g','h')

    // iterating through list
    for(c in listOfLetters){
        println(c)
    }

    // index with values
    for((i,c) in listOfLetters.withIndex()){
        println("Index $i : value: $c")
    }
}