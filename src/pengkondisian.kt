fun main() {
    var namaku: String = "Musnadil"
    var temen: String = "Danni"
    //tidak sama dengan
    if (namaku != temen) {
        println("nama kau beda")
    } else {
        println("nama kau sama")
    }

    val pulpen: Int = 10;
    val pensil: Int = 11;

    if (pulpen < pensil) {
        println("benar")
    } else {
        println("salah")
    }

    val monitor: Int = 20;
    val cpu: Int = 20;

    if (monitor <= cpu) {
        println("semua monitor ada cpunya")
    } else if (monitor > cpu) {
        println("tidak semua monitor ada cpunya")
    }else{
        println("belum ada komputer")
    }
}