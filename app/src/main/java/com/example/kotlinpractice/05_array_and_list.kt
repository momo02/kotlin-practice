package com.example.kotlinpractice

fun main(){
    array()
}

// 5. Array and List
// Array -> 정해진 사이즈. 메모리 선 할당. 처음에 크기를 지정해줘야함.
// List -> 1. List (immutableList 수정불가) 2. MutableList (수정가능)

fun array() {
    val array= arrayOf(1,2,3)
    val list= listOf(1,2,3)

    val array2= arrayOf(1,"d", 3.4f)
    val list2 = listOf(1,"d",11L)

    //기본적으로 array는 값 변경 가능.
    array[0] = 3

    // 그냥 List 는 쓰기 불가. 읽기만 가능.
    // list[0] = 2 (X)
    var result = list.get(0);
    println(result)

    // MutableList 의 가장 대표적 예가 ArrayList
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

    //cf. val(상수) 로 써도 되는 이유는 ArrayList 객체의 참조값(주소값) 자체는 변동이 없기 때문.
    // arrayList = arrayListOf() -> 이런식으로 새로운 주소를 재할당하려고하는 경우에는 에러.
    arrayList[0] = 20

    println(array.get(0))
    println(arrayList)
}
