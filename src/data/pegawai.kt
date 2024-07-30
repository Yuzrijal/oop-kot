package data

open class pegawai (val name:String) {
    fun menyapa(name:String){
        println("Halo $name, namaku adalah ${this.name}")
    }
}

class manajer(name:String) : pegawai(name)

class kasir(name: String) : pegawai(name)