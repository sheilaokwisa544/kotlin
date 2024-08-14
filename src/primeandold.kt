import java.util.Scanner

fun main() {
    var num = Scanner(System.`in`)
    println("enter a number: ")
    var number = num.nextInt()
    if (number == 0 || number == 1){
        println("not a prime or odd number")
    }
   if ( number % 2 == 0) {
       println("a prime number")}

    else{
        println("odd number")
    }

}