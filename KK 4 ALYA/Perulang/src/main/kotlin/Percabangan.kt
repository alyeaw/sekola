fun main(){
    println("Masukkan nominal belanja : ")
    var nominal = readln().toInt()
    if (nominal>=150000){
        println("Diskon 10% jadi : "+(nominal-(nominal*10/100)))
    }else if (nominal==0){
        println("Anda tidak berbelanja")
    }else{
        println("Tidak mendapat diskon jadi " + nominal)
    }
}