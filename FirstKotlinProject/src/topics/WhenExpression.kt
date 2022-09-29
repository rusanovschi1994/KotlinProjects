package topics

fun main(){

    whenFunction(1);
    whenFunction("Hai Moldova")
    whenFunction(21)
}

fun whenFunction(input: Any){

    when (input){

        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("Between 10 and 20")
        is String -> println("Its a String")
        else -> println("something else")
    }
}