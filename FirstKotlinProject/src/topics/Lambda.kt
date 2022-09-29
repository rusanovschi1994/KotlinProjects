package topics

fun main(){

    val a = listOf(2, 3, 4, 5, 6)

    //Trece peste fiecare din valori
    a.forEach {e -> println(e)}

    //metoda map creaza o lista noua
    println(a.map { e -> e * 2 })

    //filtreaza lista
    println(a.filter {e -> e % 2 ==0 })

    //in cazul nostru face suma valorilor multimii
    println(a.reduce { sum, e -> sum + e })

    //sorteaza valorile multimii in descrestere
    println(a.sortedByDescending { it })

    //any - daca macar una dintre valorile multimii este > 10 va fi true
    println(a.any { it > 10 }) //false

    //all - daca toate valorile colectiei vor fi < 10 va fi true
    println(a.all { it < 10 }) //true

    //partition - in cazul nostru ca diviza colectia numbers in doua colectii
    //una cu numere pozitive alta cu numere negative
    val numbers = listOf(1, 2, - 1, -5, 10, -3)
    val (positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)

    //gruparea valorilor colectiei conform unui hashMap(cheie, valoare)
    val result = listOf("a", "bb", "cac", "dfff", "ssssss", "s").groupBy { it.length }
    println(result)



}