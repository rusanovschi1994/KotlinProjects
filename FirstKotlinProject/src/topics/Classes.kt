package topics

import kotlin.concurrent.fixedRateTimer

fun main(){

    var child = Person("Child", "Child", 1)

    var p1 = Person("Cristian", "Rusanovschi", 50, child)
    println(p1.firstName)

    var rectangle1 = Rectangle(10.0, 21.0)
    println("The perimeter of rectangle = ${rectangle1.perimeter}")

    var rectangle2 = Rectangle(10.0, 21.0)
    println(rectangle1 == rectangle2)
    println("Rectangle area is ${rectangle2.area()}")

}

//Primary constructor
class Person(val firstName: String, val secondName: String, var age: Int) {

    var children: MutableList<Person> = mutableListOf()

    init {
        println("Person is created: $firstName")
    }

    //second constructor
    constructor(firstName: String, secondName: String, age: Int, child: Person):
            this(firstName, secondName, age){
                children.add(child)
            }

    //constructor without arguments
    constructor(): this("", "", -1)

}
// when we use "data" - automatically is created methods equals, hashCode, toString
data class Rectangle(var height: Double, var length: Double){

    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1
        set(value){
            if(value < 0) println("Negative value")
            field = value
        }

    //functie(metoda) in clasa
    fun area() = height * length
}