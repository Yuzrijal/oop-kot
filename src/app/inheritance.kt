package app

import data.kasir
import data.manajer

fun main() {
    val manajer = manajer("Alex")
    manajer.menyapa("Gatot")

    val kasir = kasir("Alex")
    kasir.menyapa("Aisyah")

    /*dibanding cape ngebuat function di semua class padahal sama, mending buat pewarisan
    karena kalau tidak, manajer dan kasir harus keatas dan buat println halo name dll
     */
}