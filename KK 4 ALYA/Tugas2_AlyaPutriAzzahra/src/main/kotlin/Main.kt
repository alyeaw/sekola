fun main(args: Array<String>) {
    println("Masukkan Nama :  ")
    val nama = readln().toString()
    println("Masukkan Umur : ")
    val umur = readln().toInt()

    var umurbaru = umur!!.toInt() + 5
    println("Saat ini $nama berumur $umur tahun dan 5 tahun yang akan datang menjadi $umurbaru tahun")

    var txt1 = ("Saat ini Rendy berumur 18 tahun dan 5 tahun yang akan datang menjadi 23 tahun")
    println(txt1.toUpperCase())
    println(txt1.toLowerCase())

    var txt2 = ("rendy")
    println("Panjang Nama : " + txt2.length)

    var greeting = ("Saat ini Rendy berumur 18 tahun dan 5 tahun yang akan datang menjadi 23 tahun")
    println(greeting.replace("e","a"))

}