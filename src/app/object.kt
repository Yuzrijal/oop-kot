package app

import data.person

fun main() {
    val yuz= person()
    yuz.firstName= "Yuz"

    val gilang= person()
    gilang.firstName= "Gilang"

    println(yuz.firstName)
    println(gilang.firstName)
}
//Kenapa hasilnya menjadi @.....? itu menunjukan lokasi dimemori kita