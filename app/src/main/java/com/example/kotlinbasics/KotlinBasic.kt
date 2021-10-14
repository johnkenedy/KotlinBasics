package com.example.kotlinbasics

fun main() {

    //Generate random characters
    val chars = ('0'..'z').toList().toTypedArray()
    val password = (1..32).map { chars.random() }.joinToString("")
    print("the password is: $password.")

}