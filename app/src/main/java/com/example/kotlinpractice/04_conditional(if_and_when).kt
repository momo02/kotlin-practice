package com.example.kotlinpractice

fun main(){
    checkNum(1)
}

// 4.조건식
/** if **/
fun maxBy(a : Int, b: Int) : Int {
       if(a>b){
           return a
       }else {
           return b
       }
}
// 더 간략한 방식
// 코틀린은 자바처럼 삼항 연산자 ex) return (a>b) ? a : b) 가 없는 대신 아래와 같은 문법 사용 가능.
fun maxBy2(a : Int, b: Int) = if(a>b) a else b

/** when - Java의 switch와 비슷 */
fun checkNum(score : Int){
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3") //복수 조건 체크 가능
        //else -> println("I don't Know") // 생략가능
    }

    //when을 Expression 방식으로 (값을 리턴하는 방식) 사용할때는 else 문 생략 불가
    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}");

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

/**
 * cf) Expression vs Statement
 *
 * - Expression : 최종적으로 어떠한 값을 반환.
 * - Statement : 말그대로 어떠한 로직을 수행하는 문장. 값 반환 X
 *
 * - Kotlin에서 모든 함수는 Expression.
 *  아무것도 리턴하지않는 경우도 사실은 Unit을 리턴함.
 *  fun checkNum(score : Int) -> fun checkNum(score : Int) : Unit (생략되있음뿐)
 *  반면, Java의 경우에는 아무것도 리턴하지 않는 경우 void 함수를 사용하는데 이는 Statement 이다.
 *
 *  if문의 경우 Java에서는 Statement로 밖에 사용할 수 없었다면,
 *  Kotlin 에서는 Expression 방식으로도 사용가능. when도 마찬가지.
 *  ex)  if(a>b) a else b
 */

