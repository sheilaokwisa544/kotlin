fun main() {

    // methods for performing tasks
    //user and library


    // standard library functions or inbuilt functions or pre-defined

    println("sheila")


    var result = Math.sqrt(144.0)
    println("the squareroot of the number is $result")


    var roundedNumber = Math.round(34.67)
    println(roundedNumber)

    // user-defined function
    // must be written outside main function
    // must call inside the main function
    day()
    multiply()
    add(78 ,40)
    add(58 ,470)
    add(780 ,430)
}

fun day(){
    println("today is tuesday")

}
fun multiply(){
    var x = 23
    var y = 10
    println(x  * y )
}

//different values
//parameters and arguments
//arguments = value
// parameter = variable

fun add(k:Int,p:Int){
    println(k+p)
}


