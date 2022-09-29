package topics

fun main(){

    val items = listOf("banana", "apple", "orange")
    items
    //forEach loop
    for(item in items) {

        println(item)
    }

    //while loop
    var index = 0
    while(index < items.size) {

        println("Item at index $index is ${items[index]}")
        index++
    }

    //Diapason from 1 to 10 (like in Python)
    for(i in 1..10)
        println(i)

    //Diapason from 1 to 9 without 10
    for(i in 1 until 10)
        println(i)

    //Diapason from 10 to 1
    for(i in 10 downTo 1)
        println(i)

    //Diapason from 1 to 100 with step 10
    for(i in 0..100 step 10)
        println(i)

    //Verifying if 5 is contains in 0..10 diapason
    println(5 in 1..10)

}