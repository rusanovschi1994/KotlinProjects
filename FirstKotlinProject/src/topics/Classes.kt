package topics

fun main(){

    var child = Person("Child", "Child", 1)

    var p1 = Person("Cristian", "Rusanovschi", 50, child)
    print(p1.firstName)
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