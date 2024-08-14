import java.util.Scanner

fun main() {
    var year = Scanner(System.`in`)
    println("enter the year: ")
    var numberofdays = year.nextInt()

    if (numberofdays %  4 ==0){
        println("leap year")
    }
    else{
        println("not a leap year")
    }


}