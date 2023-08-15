fun main() {
    val dataNama= listOf("ayam bakar","ayam goreng")
    val dataHarga= listOf(50,40)
    println("pilih menu makanan")
    val jawaban =readLine()!!.toInt()
    if (jawaban==1){
        println("Nama Menu : "+dataNama.get(0))
        println("Harga : Rp"+dataHarga.get(0)!!.toString()+".000")
    }else if (jawaban==2){
        println("Nama Menu : "+dataNama.get(1))
        println("Harga : Rp"+dataHarga.get(1)!!.toString()+".000")
    }
}