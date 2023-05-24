fun main(args: Array<String>) {
    val lampu = 2
    val result = when {

        lampu == 1 -> println("lampu hijau, jalan!")
        lampu == 2 -> println("lampu kuning, hati-hati!")
        lampu == 3 -> println("lampu merah, berhenti!")
        else -> print("lampu komnslet")
    }
}