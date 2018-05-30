fun main(arg : Array<String>){

    // Direct access
    // singleton method called

    Phones.phoneList.add(PhoneDetails("Note 8",1000))
    Phones.phoneList.add(PhoneDetails("S8",700))
    Phones.phoneList.add(PhoneDetails("S9",900))

    Phones.showPhones()

}

data class PhoneDetails(val phone : String, val price: Int)

// Singleton Object
    object Phones{
        var phoneList = arrayListOf<PhoneDetails>()

    fun showPhones(){

        for(i in phoneList){
            println(i)
        }
    }
    }
