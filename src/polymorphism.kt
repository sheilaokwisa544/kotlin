open class shape{
     open fun draw(){
         println("drawing a shape")
     }
}
class rectangle:shape(){
   override fun draw(){
        println("drawing a rectangle")
    }
}
class rhombus:shape(){
    override fun draw(){
        println("drawing a rhombus")
    }
}
// objects
fun main() {
    var a = shape()
    a.draw()
    var b = rectangle()
    var c = rhombus()

}