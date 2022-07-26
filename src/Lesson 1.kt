import java.util.*

fun main() {

    // int
    val scanner = Scanner(System.`in`)
    var age = scanner.nextInt()
    when (age) {
     in   1..10 -> println(1+10)
     in    11..20 -> println(11+20)
        else -> println("error")
    }

}