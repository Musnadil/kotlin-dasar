fun main (){
    //Explisit
    val members: Array<String> = arrayOf("Eko", "Joko", "Budi")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    //implisit
    val array1 = arrayOf("1", 2, 3 )

    //size = panjang array
    println(members.size)

    //mendapat data di posisi index
        // 1. use get(index)
    println(array1.get(0))

        // 2. use[index]
    println (members[1])
    println (array1[0])
    println (array1[1])
    println (array1[2])
    println("========================================================================")

    // merubah data di posisi index
        // 1. use set(index,value)
    members.set(0,"amar")
        // 2. use [index]=value
    val amar : String = members[0]

    println(members[0])
    println("=========================================================================")

    // array nullable

    val names: Array<String?> = arrayOfNulls(size =  5)
    names.set(0, "musnadil")
    names.set(1, null)
    names.set(2, "firdaus")
    names.set(3, null)
    names.set(4, "Musnadil Firdaus")


    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])
    println(names[4])

}