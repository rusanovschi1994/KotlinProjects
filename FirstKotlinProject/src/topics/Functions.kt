package topics

fun main(){

    println(testSimple(5, 10))

    println(testString(10))

    println(testNamedArguments(z = 5, x = 10, y = 6))

    defaultNamedArguments()

    printEvent(1, 2, 3, 4, 5, 6, 7)

    println("PrintEvent with *intArrayOf")
    printEvent(*intArrayOf(10, 11, 12, 13), 14, 15, 16, 17, 18, 19, 20)
}

fun testSimple(x: Int, y: Int): Int = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int>{
    return listOf(x, y, z);
}

//void function
fun defaultNamedArguments(x: Int = 5, y: Int = 10){
    println(x + y)
}

fun printEvent(vararg number: Int){

    var index = 0
    while(index < number.size){
        println("The number at index $index is ${number[index]}")
        index++
    }
}


