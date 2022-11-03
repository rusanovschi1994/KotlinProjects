package topics

fun main(){

    var a: String = "Hello";
    //a = null;

    //SafeCall String?
    var b: String? = "hi";
    b = null;

    //Return length of b else return null(nor NPE!)
    b?.length

    //Elvis operator
    val a1: String? = readLine();
    val a2: String = a1 ?: "Nothing has been entered"
    println("Length result is: ${a2.length}")
}