package app

import data.address

fun main() {
    val address1 = address("Gunungkidul", "DIY")
    val address2 = address("Kediri", "Jawa Tengah")

    println(address1.kabupaten)
    println(address2.kabupaten)
}