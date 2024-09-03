package com.example.kotlin

fun multiple2(block: () -> Int): Int {
//    return block.invoke() * 2
    return block() * 2  // invoke 생략 가능
}

fun main() {
    val will5 = { 5 }

    println(multiple2(will5)) // 함수를 매개변수로 전달

    println(multiple2 { 50 }) // 내부에서 직접 함수 구현 후 전달

    println(
        multiple2 {
            50
            // postfix - 소괄호() 를 대신해서 중괄호 사용가능
            // 함수의 마지막 인자로 전달되는 람다는 괄호 밖에서 사용할 수 있음
        }
    )
}