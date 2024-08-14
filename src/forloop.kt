fun main() {

    for (number in 65..70){
        println("my number is $number")
    }
    // CHARACTERS
    for (letter in 'D'..'F'){
        println("my letter is $letter")
    }
    // to stop count
    for (count in 100..105){
        if (count == 103){
            break
        }
        println(count)

    }
    // skipping a value
    for (mycharacter in 'a'..'d'){
        if (mycharacter == 'b'){
            continue
        }
        println(mycharacter)
    }
}