package com.example.kotlinpractice

fun main(){

}

//2. val vs var
//val = value.값.(바뀌지 않는 상수값)
fun hi() {
    val a = 10
    //a = 100 //에러
    var b = 9
    b = 100

    var c : Int = 100 //명시적으로 타입 안써줘도 타입을 자동으로 추론. 대부분 생략
    var d = 100

    var name = "jeongha"

    // but, 값 바로 할당안할 경우에는 타입 선언 필수
    var e : String
}


