

data class gadgets(val mobile : String, val price : Int){

    var mobile2 : String = mobile
    var price2 : Int = price

    fun show(){
        println("Mobile: $mobile2 price: $price2")
    }

}
 fun main(arg : Array<String>){


    var gad1 : gadgets = gadgets("Note 9",1000)

    var gad2 : gadgets = gadgets("Note 9",1000)

     // copy() by data keyword

    var gad3 : gadgets = gad2.copy("S9",800)
     //  keeping the entire object
     // changing value of price
     var gad4 : gadgets = gad2.copy(price = 500)

            println(gad3.equals(gad2))
            println("Mobile: ${gad3.mobile2} price: ${gad3.price2}")
            println("Copy of gadget 3 Mobile: ${gad4.mobile2} price: ${gad4.price2}")
}