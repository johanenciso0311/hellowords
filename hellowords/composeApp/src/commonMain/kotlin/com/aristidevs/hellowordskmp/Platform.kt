package com.aristidevs.hellowordskmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform