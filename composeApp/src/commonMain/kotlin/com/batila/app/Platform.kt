package com.batila.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform