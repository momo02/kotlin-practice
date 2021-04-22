package com.example.kotlinpractice

/**
 * cf) Kotlin Class - Java Class 와 다른점.
 * - 파일 이름이랑 클래스 이름이 반드시 일치하지 않아도 됨.
 * - 여러 클래스도 한 파일 안에 넣을 수 있다.
 */
open class Human /* constructor (생략가능) */(val name : String = "Anonymous") { //기본(주)생성자

    //val name = "jeongha"
    //val name = name

    //부 생성자는 주 생성자의 위임을 받아야함. this 라는 예약어를 사용해 name 을 받아옴.
    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }

    //생성자에서 코드 블럭 실행하고 싶을 경우 init 코드블럭 사용.
    //클래스의 인스턴스를 생성하는 시점에 수행하고 싶은 코드 작성.
    init {
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMYYY~~~~~")
    }

    open fun singASong() {
        println("lalala")
    }
}

/**
 * 상속
 * - kotlin의 클래스는 기본적으로 final 클래스. class 앞에 open 예약어를 써주어야 접근(상속)가능.
 * - 자바와 마찬가지로 단일 상속만 가능.(다중상속 X. 부모클래스 1개)
 */
class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("랄랄라~")
        println("my name is $name")
    }
}


fun main() {
    val human = Human("junsung") //new 키워드 안씀.
    human.eatingCake()

    println("this human's name is ${human.name}")

    val stranger = Human()
    println("this human's name is ${stranger.name}")

    val mom = Human("sookyong", 52 )

    val korean = Korean()
    korean.singASong()
}