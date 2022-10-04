package topics

fun main(){

    //number of repeated intersection
    //[1, 2, 3, 2, 5] , [5, 3, 2, 3, 1, 2]
    //result [1, 2, 2, 3, 5]

    println(getRepeatedIntersection(intArrayOf(1, 2, 3 ,2, 3, 4), intArrayOf(2, 3, 2, 4, 4, 5, 1)))
}

fun getRepeatedIntersection(a1: IntArray, a2: IntArray): List<Int>{

    val s1 = a1.toHashSet()
    val s2 = a2.toHashSet()

    val result = mutableListOf<Int>()

    for(el in s1){
         if(s2.contains(el)){
             val numOfRepeats = minOf(a1.count { it == el }, a2.count { it == el })
             repeat(numOfRepeats){
                 result.add(el)
             }
         }
    }

    return result
}



