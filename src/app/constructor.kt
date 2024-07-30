package app

import data.car

fun main() {
    val toyota = car("toyota")
    //tanpa const, mengubah default value harus seperti ini
    //ferrari.year=2012
    val daihatsu = car("Daihatsu", "Xenia")

    // dengan const, mengganti default value hanya seperti ini
    //Jadi cons adalah function pertama kali yang dieksekusi ketika objek dibuat
    println(toyota.brand)
    println(toyota.year)
    println(daihatsu.brand)
    println(daihatsu.year)
}