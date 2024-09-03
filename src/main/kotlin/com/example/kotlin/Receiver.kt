package com.example.kotlin

data class Configuration(
    var host: String = "",
    var port: Int = 0,
)

fun configure(block: Configuration.() -> Unit): Configuration {
    val config = Configuration()

    config.block() // 매게변수도 마치 Configuration 의 내부 클래스 처럼 사용 가능
    block(config) // 위와 동일
    block.invoke(config) // 위와 동일

    return config
}

fun main() {
    val config = configure {
        host = "localhost"
        port = 8080
    }
    println(config)

    val conf1 = Configuration().apply {
        host = "localhost1"
        port = 8081
    }
    println(conf1)
}

