class Reguler(private val nim: String, val nama: String, private val sppTetap: Int, private val sppVariabel: Int){
    fun hitungBiayaKuliah(): Int {
        return sppTetap + sppVariabel
    }
}

fun main() {
    print("Nama Mahasiswa: ")
    val nama = readLine()!!.toString()
    print("Masukkan NIM : ")
    val nim = readLine()!!.toString()
    print("Nilai SPP tetap: ")
    val sppTetap = readLine()!!.toInt()
    print("Nilai SPP variabel: ")
    val sppVariabel = readLine()!!.toInt()

    val mahasiswa = Reguler(nim, nama, sppTetap, sppVariabel)
    val biayaKuliah = mahasiswa.hitungBiayaKuliah()
    println("Biaya kuliah untuk $nama adalah: Rp $biayaKuliah")
}