fun main(args: Array<String>) {
    println("------------Toko Sembako Ashoygebhoy--------")
    print("Terigu: ")
    println(" Rp 4.000")
    print("Telor : ")
    println(" Rp 2.000")
    print("Shampo : ")
    println(" Rp 1.000")
    print("sabun batang : ")
    println(" Rp 3.500")

    println("---------------------------------------")
    print("Beli apa : ")
    val Beli = readln().toInt()
    print("Berapa biji : ")
    val Berapa = readln().toInt()

    var Harga: Int = 0
    if (Beli == 1){
        Harga = 4000
    } else if (Beli == 2) {
        Harga = 2000
    } else if (Beli == 3) {
        Harga = 1000
    } else if (Beli == 4) {
        Harga = 3500
    }

    val Total = Harga * Berapa
    println("Total = $Total")


    print("Uang dibayar : ")
    val Uang = readln().toInt()

    val Kembalian = Uang-Total
    print("Kembaliannya = $Kembalian")

}