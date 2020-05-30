// Komentar
fun main(args: Array<String>){
    var nums = arrayOf(1,20,22)
    println(nums.toList())

    val banyak = false
    var x: Int
    x = 0
    if (banyak == true ){
        println(banyak)
    } else {
        println(false)
    }

//===========================================
    panggilSaya("Ronal")
//===========================================
    val sayaAdalah = "as"
    val ninja = arrayOf("Ronal","Saya","dia")
    if (sayaAdalah in ninja){
        println("Ada")
    }else{
        println("Tidak ada")
    }

    if (sayaAdalah != "ronal") {
        println("$sayaAdalah bukan ronal")
    }
//===========================================
    println("Masukan angka pertama")
    val a1 = readLine()
    println("Masukan angka pertama")
    val a2 = readLine()
    println("Masukan Operator")
    val a3 = readLine()
    val hasil = when(a3){
        "+" -> a1 + a2
        "-" -> a1 + a2
        "*" -> a1 + a2
        else -> a1 + a2
    }
    println(hasil)
//===========================================
    var r = 1
    while (r <= 5){
        println("Pengulangan while $r")
        ++r
    }
//===========================================
    for (c in 1..5){
        println("Pengulangan for $c")
    }
    val tblArr = arrayOf("siapa","aku","testi","apa")
    for (l in tblArr){
        println("Ini isi arraynya $l")
    }

}



fun panggilSaya(e: String){
    println("Hallo $e")
}