package com.example.kotlin

fun nonLambda(a: Int, b: Int): Int {
    return a + b
}

// 모두 동일한 함수 ----------------------------------------------
val lambdaAdd1: (a: Int, b: Int) -> Int = { a, b -> a + b }

val lambdaAdd2: (a: Int, b: Int) -> Int =
    { a, b ->
        a + b // 마지막 줄 return
    }

val lambdaAdd3 = { a: Int, b: Int -> a + b }
//-------------------------------------------------------------

fun main() {
    val a = 5
    val b = 10

    println(nonLambda(a, b))
    println(lambdaAdd1.invoke(a, b)) // invoke를 하면 함수의 파라미터를 넣어줄 수 있음
    println(lambdaAdd1(a, b)) // 생략 가능

}