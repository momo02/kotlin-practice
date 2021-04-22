package com.example.kotlinpractice

fun main(){
    //3. String 템플릿
    val name = "jeongha"
    val lastName = "Park"
    println("my name is $name")
    println("my name is ${name + lastName}I'm 29")

    println("is this true? ${1==0}")
    //$ 문자 이스케이프 처리는 백슬래쉬 \ 사용.
    println("this is 2\$a")
}


