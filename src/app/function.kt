package app

import data.person

fun main() {
    val yuz= person()
    yuz.firstName="Muhammad"
    yuz.midName="Alias"
    yuz.lastname="Yusrizal"

    yuz.menyapa("Aziz")
    yuz.lari()

    val namaPanjang = yuz.ambilnamapanjang()
    println(namaPanjang)
    /*Disini kita bisa menambahkan function pada person
    Jadi intinya OOP menggabungkan properties2 dan function2 yang satu grup
    Suatu saat jika bikin objek, 1 bikin objek version, 2.akses properties nya yaitu firtmidlastname, 3.akses function*/
}