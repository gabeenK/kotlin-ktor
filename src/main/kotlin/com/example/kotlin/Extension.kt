package com.example.kotlin

fun main() {
    val s = "world"
    s.printHello() // printHello()가 String 의 기존 함수인 것처럼 확장해서 사용 가능

    val l = listOf(1, 2, 3, 4, 5)
    println(l.removeEven()) // generic type 도 확장함수 가능
}

fun String.printHello() {
    println("hello $this")
}

fun List<Int>.removeEven(): List<Int> {
    return this.filter { it % 2 != 0 }
}