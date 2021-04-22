package com.example.kotlinpractice

fun main(){
    nullcheck()
}

// 7. Nullable / NonNull
fun nullcheck(){
    // NPE : Null Pointer Exception
    // => Java 에서는 컴파일 시점에서 에러를 잡을 수 없음. Runtime 시점, 즉 코드를 돌려봐야만 잡을 수 있는 대표적인 Runtime Exception.

    // 이러한 불편함을 해소하고자 Kotlin 에서는 컴파일 시점에 NPE를 캐치할수 있도록 한것이 바로 이 ?(물음표) 이다.
    var name : String = "jeongha" // non null type

    var nullName : String? = null // 타입뒤에 ?를 넣어주면 null 값 넣기 가능. 이 경우에는 타입 뒤에 ?를 넣어줘야하므로 타입 생략 불가.

    // name이 non null type 이기때문에 name.toUpperCase() 역시 non null type
    var nameInUpperCase = name.toUpperCase()

    // nullName 이 nullable type 이기때문에, null 일수도 있어서 toUpperCase() 를 바로 사용할 수 없음.
    // var nullNameInUpperCase = nullName.toUpperCase() //(X)

    // nullName이 null이 아니면 toUpperCase를 하고, null이면 nullName?.toUpperCase() 전체가 null을 반환할 것이라는 코드.
    // 이를 추론해서 반환 타입도 그냥 String 이  아닌 String? (nullale String type)이 되는 것.
    var nullNameInUpperCase = nullName?.toUpperCase() //(O)

    // <장점>
    // 자바에서는 if(null = x) else { ~~ } 이런 식으로 처리해야 했던것을 간단한 연산자 ? 하나로 간단하게 처리 가능!
    // 또한 컴파일 시점에서부터 오류를 미리 알려줌으로써 추후 런타임 시점에 NPE 에러가 발생될 일이 없다.

    //  ?: => null일 때 default값을 주고 싶은 경우 사용.
    //val lastName : String? = null
    val lastName : String? = "Park"

    val fullName = name + " " + (lastName?: "No lastName")
    println(fullName)

    // !! => nullable type 인 특정 값이 null이 아님을 컴파일러에게 명시(보증)해주고자 할때 사용.
    // 확실하게 해당 값이 null 이 아닐 하는 경우 외에는 웬만하면 사용을 지양함. 혹시라도 null 이라면 런타임 시 NPE 발생될 수 있기 때문.
    ignoreNulls("test")
}

fun ignoreNulls(str : String?){
    //val mNotNull : String = str // error
    val mNotNull : String = str!! //여기에는 정말 null이 들어올 일이 없어! 하는 경우 !!을써서 해당 값이 null이 아님을 컴파일러에게 명시적으로 알려주는 것.
    val upper  = mNotNull.toUpperCase()
    println(upper)

    //val email : String?  = "jeongha@nana.com"
    val email = null

    //email이 null이 아니면 let안의 구문을 수행하라는 뜻.
    //cf) let 함수는 자신의 receiver 객체를  람다식 내부로 옮겨서 실행하는 구문.
    // receiver 객체 -> 여기서는 email을 람다식 내부로 옮겨줌. 즉 여기서는 email이 null이 아니라면 람다식 내부로 옮겨준다는 뜻.
    email?.let{
        println("my email is ${email}")
        println("my email is ${it}") //email 대신 it 사용 가능.
    }
}