fun main(){
    val range = 0..100
    val range2 = 100 downTo 0 step 2

    for (i in 1 until 10) {
        println("data ke-$i = $i,")
    }
    for (i in 1..10) {
        println("data ke-$i = $i,")
    }



    println(range.count())
    println(range.contains(9))
    println(range.contains(12))
    println(range.first)
    println(range.last)
    println(range.step)
    println(range.step)
    println(range.contains(45))
    println(range2)


}