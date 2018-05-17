

fun main(arg : Array<String>){

    println("Hello Kotlin")

    // creating object of the class
    var objectVariableDeclaration = VariableDeclaration()

    // accessing variable of another class
    var getName: String = objectVariableDeclaration.name

    // printing name and concatinating
    println("The name is ${objectVariableDeclaration.name}")

    // printing name and concatinating
    println("The name is ${getName}")
}