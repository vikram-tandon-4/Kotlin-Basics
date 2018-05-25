fun main(arg : Array<String>){
    // Son object of type Son
    var familyMember : Sons = Sons()
    familyMember.commonFunc()
    familyMember.noDefFunc()
}

abstract class Fathers{

    abstract fun noDefFunc()

    open fun commonFunc(){
        println("This is Fathers")
    }
}

class Sons : Fathers(){
    override fun noDefFunc() {
        println("Defining No Definition function")
    }

    override fun commonFunc(){
        println("This is Sons")
    }
}