package app

import data.user

fun main() {
    val user1 = user("Bejo","cukurukuk")
    val user2 = user("tukiyo", "kiwkiw")

    user1.username="Madi"
    user1.password="combro"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

    //di kotlin bisa bikin properties yg langsung dideklarasikan diprimary const
    //cuma bisa di primary tidak bisa secondary
}
