import java.util.*
import kotlin.collections.HashMap

fun main(arg : Array<String>){

    var hashMap = HashMap<String,Int>()
    hashMap["a"] = 1
    hashMap["b"] = 2
    hashMap["c"] = 3
    hashMap["d"] = 4
    hashMap["e"] = 5

    for((str,i) in hashMap){
        println("key : $str  value : $i")
    }
}