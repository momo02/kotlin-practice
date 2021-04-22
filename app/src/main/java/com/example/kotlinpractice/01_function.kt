package com.example.kotlinpractice

fun main(){
    helloWorld()
    println(add(4,5))
}

//1.함수
fun helloWorld() /* : Unit*/ {
    println("Hello world!");
}

fun add(a : Int, b : Int) : Int {
    return a + b
}
