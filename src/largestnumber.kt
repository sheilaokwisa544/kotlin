import java.util.Scanner

fun main() {
    var large = Scanner(System.`in`)
    println("enter the first number: ")
    var first = large.nextInt()
    println("enter the second number: ")
    var second = large.nextInt()
    println("enter the third number: ")
    var third = large.nextInt()
    println("enter the fourth number: ")
    var fourth =large.nextInt()
   if (first > second && first > third && first > fourth){
       println("first is the greatest")
   }
    else if (second > first && second > third && second > fourth){
        println("second is the greatest")
    }
    else if (third > first && third > second && third > fourth){
        println("third is the greatest")
    }
    else{
        println("fourth is the greatest")
    }

}