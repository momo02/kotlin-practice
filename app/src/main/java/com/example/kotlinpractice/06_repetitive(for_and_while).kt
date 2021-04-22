package com.example.kotlinpractice

fun main(){
    practiceFor()
    practiceWhile()
}

// 6. 반복문 (For / While)
fun practiceFor() {

    val students = arrayListOf("jeongha", "junsung", "iu", "jenny")

    for(name in students){
        println("name is ${name}")
    }

    //index도 함께 사용하고 싶은 경우
    for((index , name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    // n..m : n 부터 m 까지 루프
    var sum : Int = 0
    for(i in 1..10){ //1부터 10까지
        sum += i
    }
    println(sum)

    // step n : n개씩 건너뛰면서 루프
    var sum2 = 0
    for(i in 1..10 step 2){ //1부터 10까지 2개씩 점프 (1,3,5,7,9)
        sum2 += i
    }
    println(sum2)

    // m downTo n : m부터 n까지 거꾸로(값을 줄이며) 루프
    var sum3 = 0
    for(i in 10 downTo 1){
        sum3 += i
    }
    println(sum3)

    // n until m : n부터 m 이전까지 루프 (m을 포함하지 않음)
    // cf) 1..100 => 1부터 100까지 / 1 until 100 => 1부터 99까지
    var sum4 = 0
    for(i in 1 until 100){
        sum4 += i
    }
    println(sum4)
}


fun practiceWhile() {
    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
}