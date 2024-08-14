import java.util.*

fun main() {
    var calculate = Scanner(System.`in`)
    println("enter the first number: ")
    var first = calculate.nextInt()
    println("enter the second number: ")
    var second = calculate.nextInt()
    println("Please enter an operator: + - * /")
    var operator = readLine()
   when(operator){
       "+" -> println("The result is ${first + second}")
       "-" -> println("The result is ${first - second}")
       "*" -> println("The result is ${first * second}")
       "/" -> println("The result is ${first / second}")
       else -> println("Unknown operator")

   }




}
