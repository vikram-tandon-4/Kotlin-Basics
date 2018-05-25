
open class Father{

    open fun commonFunc(){
        println("This is Father")
    }
}

class Son : Father(){

    override fun commonFunc(){
        println("This is Son")
    }
}

fun main(arg : Array<String>){

    // Son object of type Son
    var familyMember : Son = Son()
    familyMember.commonFunc();

    // Son object of type Father
    var familyMember2  : Father= Son()
    familyMember2.commonFunc();

    // Father object
    var familyMember3  : Father= Father()
    familyMember3.commonFunc();
}
