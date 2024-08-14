 open class animal{
    fun isMammal(){                                 // behaviour
        println("animal is a mammal")
    }

}


open class duck:animal(){
    var hasFeathers = true
    fun swim() {
        println("duck is swimming")
    }
    }

 class bat:duck(){
     var isBlind = true
 }

 fun main() {
    var a = animal()
     a.isMammal()
    var b = duck()

    var c = bat()
    println()
}