import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan bilangan bulat positif kurang dari 4000: ")
    val input = scanner.nextInt()

    if (input <= 0 || input >= 4000) {
        println("Bilangan yang benar atau kurang dari 4000")
    } else {
        var n = input
        var romawi = ""

        val values = listOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val symbols = listOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

        for (i in values.indices) {
            while (n >= values[i]) {
                romawi += symbols[i]
                n -= values[i]
            }
        }

        println("$input dalam bilangan romawi adalah $romawi")
    }
}

